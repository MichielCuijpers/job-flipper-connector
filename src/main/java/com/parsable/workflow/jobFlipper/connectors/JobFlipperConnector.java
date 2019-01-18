package com.parsable.workflow.jobFlipper.connectors;

import java.util.HashMap;
import java.util.Map;

import org.activiti.cloud.api.process.model.IntegrationRequest;
import org.activiti.cloud.api.process.model.IntegrationResult;
import org.activiti.cloud.connectors.starter.channels.IntegrationResultSender;
import org.activiti.cloud.connectors.starter.configuration.ConnectorProperties;
import org.activiti.cloud.connectors.starter.model.IntegrationResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @Autowired
    private ConnectorProperties connectorProperties;

    private final IntegrationResultSender integrationResultSender;

    public JobFlipperConnector(IntegrationResultSender integrationResultSender) {
        this.integrationResultSender = integrationResultSender;
    }

    @StreamListener(value = JobFlipperChannels.JOB_FLIPPER_CONSUMER)
    public void flipJob(IntegrationRequest event) throws InterruptedException {
        Message<IntegrationResult> message = buildFlipJobMessage(event);
        integrationResultSender.send(message);
    }

    public Message<IntegrationResult> buildFlipJobMessage(IntegrationRequest event) throws InterruptedException {
        Boolean jobStartSuccess = false;
        Error error = null;

        String logSquawk = ">>> " + JobFlipperConnector.class.getSimpleName() + " was called for instance " + event.getIntegrationContext().getProcessInstanceId();
        logger.info(append("service-name", appName), logSquawk);

        Map<String, Object> results = new HashMap<>();

        String jobId = String.valueOf(event.getIntegrationContext().getInBoundVariables().get("jobId"));

        // note: when an inbound String variable isn't present, it's set to "null" instead of null
        if (jobId == "null") {
            jobId = null;
        }

        if (jobId == null) {
            logger.info(append("service-name", appName), ">>> jobId not found");
            error = new Error("Job ID not found in integration context inbound variables");
        } else {
            results.put("jobId", jobId);
            logger.info(append("service-name", appName), ">>> jobId = [" + jobId + "]");
        }

        // TODO attempt to start job and set jobStartSuccess based on the value from that attempt

        // Add success boolean and error variables
        results.put("jobStartSuccess", jobStartSuccess);
        results.put("error", error);

        Message<IntegrationResult> message = IntegrationResultBuilder.resultFor(event, connectorProperties)
                .withOutboundVariables(results)
                .buildMessage();

        return message;
    }
}
