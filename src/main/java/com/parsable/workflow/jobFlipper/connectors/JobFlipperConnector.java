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

        String logSquawk = ">>> " + JobFlipperConnector.class.getSimpleName() + " was called for instance " + event.getIntegrationContext().getProcessInstanceId();
        logger.info(append("service-name", appName), logSquawk);

        // 1. retrieve job id from event
        // TODO

        // 2. attempt to start job and set jobStartSuccess based on the value from that attempt
        // TODO
        Boolean jobStartSuccess = false;

        Map<String, Object> results = new HashMap<>();
        results.put("jobStartSuccess", jobStartSuccess);

        Message<IntegrationResult> message = IntegrationResultBuilder.resultFor(event, connectorProperties)
                .withOutboundVariables(results)
                .buildMessage();
        integrationResultSender.send(message);
    }
}
