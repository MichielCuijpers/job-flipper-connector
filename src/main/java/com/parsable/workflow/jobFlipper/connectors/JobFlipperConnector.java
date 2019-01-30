package com.parsable.workflow.jobFlipper.connectors;

import java.util.HashMap;
import java.util.Map;

import com.parsable.apiClient.Client;
import com.parsable.apiClient.ClientImpl;
import com.parsable.common.Environment;
import com.parsable.workflow.jobFlipper.connectors.contextVariables.ContextVariableManipulator;
import com.wi.director.thrift.v1.common.SystemException;
import org.activiti.cloud.api.process.model.IntegrationRequest;
import org.activiti.cloud.api.process.model.IntegrationResult;
import org.activiti.cloud.connectors.starter.channels.IntegrationResultSender;
import org.activiti.cloud.connectors.starter.configuration.ConnectorProperties;
import org.activiti.cloud.connectors.starter.model.IntegrationResultBuilder;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static net.logstash.logback.marker.Markers.append;

@Component
@EnableBinding(JobFlipperChannels.class)
public class JobFlipperConnector {
    private final Logger logger = LoggerFactory.getLogger(JobFlipperConnector.class);

    @Value("${spring.application.name}")
    private String appName;

    private final Marker SERVICE_NAME_LOG_MARKER = append("service-name", appName);
    private final String JOB_START_SUCCESS_TOKEN_PREFIX = "jobStartSuccess::";

    @Autowired
    private ConnectorProperties connectorProperties;

    private final IntegrationResultSender integrationResultSender;

    private final Client client;

    private IntegrationRequest event;

    public JobFlipperConnector(IntegrationResultSender integrationResultSender, Client client) {
        this.integrationResultSender = integrationResultSender;
        this.client = client;
    }

    @StreamListener(value = JobFlipperChannels.JOB_FLIPPER_CONSUMER)
    public void flipJob(IntegrationRequest event) throws TException {
        Message<IntegrationResult> message = buildFlipJobMessage(event);
        integrationResultSender.send(message);
    }

    public Message<IntegrationResult> buildFlipJobMessage(IntegrationRequest event) throws TException {
        this.event = event;

        logger.info(
                SERVICE_NAME_LOG_MARKER,
                "{} was called for instance",
                JobFlipperConnector.class.getSimpleName(),
                event.getIntegrationContext().getProcessInstanceId()
        );

        String jobId = ContextVariableManipulator.getJobIdForIntegrationRequest(event);
        if (jobId == null) {
            String msg = "Job ID not found in integration context inbound variables";
            logger.info(SERVICE_NAME_LOG_MARKER, msg);
            return messageResult(event, false, null, msg);
        }
        logger.info(SERVICE_NAME_LOG_MARKER, "jobId = [" + jobId + "]");

        String adminUser = Environment.getAdminUser();
        String adminPass = Environment.getAdminPass();
        logger.info(SERVICE_NAME_LOG_MARKER, "authenticating user '{}' against Parsable API", adminUser);
        try {
            client.setUser(adminUser, adminPass);
        } catch (SystemException e) {
            logger.error(
                    SERVICE_NAME_LOG_MARKER,
                    "encountered {} attempting authenticate against Parsable API: '{}'",
                    e.getClass().getSimpleName(),
                    e.getMessage()
            );
            return messageResult(event, false, null, e.getMessage());
        }

        logger.info(SERVICE_NAME_LOG_MARKER, "starting job via Parsable API");
        try {
            client.getJobClient().start(jobId);
        } catch (SystemException e) {
            logger.error(
                    SERVICE_NAME_LOG_MARKER,
                    "encountered {} attempting start a job via Parsable API: '{}'",
                    e.getClass().getSimpleName(),
                    e.getMessage()
            );
            return messageResult(event, false, null, e.getMessage());
        }

        Message<IntegrationResult> message = messageResult(event, true, jobId, null);

        return message;
    }

    private Message<IntegrationResult> messageResult(IntegrationRequest event, boolean success, String jobId, String error) {
        Map<String, Object> results = new HashMap<>();

        results.put(generateJobStartSuccessToken(), success);

        if (jobId != null) {
            results.put(ContextVariableManipulator.generateJobIdAccessorToken(event), jobId);
        }

        if (error != null) {
            results.put("error", error);
        }

        logger.info(SERVICE_NAME_LOG_MARKER, "returning message with outbound variables: {}", results);
        return IntegrationResultBuilder.resultFor(event, connectorProperties)
                .withOutboundVariables(results)
                .buildMessage();
    }

    private String generateJobStartSuccessToken() {
        return JOB_START_SUCCESS_TOKEN_PREFIX + event.getIntegrationContext().getActivityElementId();
    }
}
