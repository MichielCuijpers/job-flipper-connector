package com.parsable.workflow.jobFlipper;

import com.parsable.workflow.jobFlipper.connectors.JobFlipperConnector;
import com.parsable.workflow.jobFlipper.mocks.IntegrationResultSenderMock;
import com.parsable.workflow.jobFlipper.mocks.IntegrationRequestMock;
import org.activiti.api.runtime.model.impl.IntegrationContextImpl;
import org.activiti.cloud.api.process.model.IntegrationRequest;
import org.activiti.cloud.api.process.model.IntegrationResult;
import org.activiti.cloud.connectors.starter.channels.IntegrationResultSender;

import org.junit.Test;
import org.springframework.messaging.Message;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class JobFlipperConnectorTest {

    @Test
    public void shouldAcceptJobIdVar() throws Exception {
        String jobIdInput = "my-dummy-job-id";

        IntegrationResultSender mockSender = new IntegrationResultSenderMock();
        JobFlipperConnector connector = new JobFlipperConnector(mockSender);

        IntegrationContextImpl context = new IntegrationContextImpl();
        Map<String, Object> inboundVariables = new HashMap<>();
        inboundVariables.put("jobId", jobIdInput);
        context.setInBoundVariables(inboundVariables);

        IntegrationRequest request = new IntegrationRequestMock();
        ((IntegrationRequestMock) request).setContext(context);

        Message<IntegrationResult> message = connector.buildFlipJobMessage(request);

        String jobIdOutput = (String) message.getPayload().getIntegrationContext().getOutBoundVariables().get("jobId");

        assertEquals(jobIdInput, jobIdOutput);
    }

    @Test
    public void shouldGracefullyHandleMissingJobId() throws Exception {
        IntegrationResultSender mockSender = new IntegrationResultSenderMock();
        JobFlipperConnector connector = new JobFlipperConnector(mockSender);

        IntegrationContextImpl context = new IntegrationContextImpl();
        Map<String, Object> inboundVariables = new HashMap<>();
        // note: we're not adding the "jobId" variable into "inboundVariables"
        context.setInBoundVariables(inboundVariables);

        IntegrationRequest request = new IntegrationRequestMock();
        ((IntegrationRequestMock) request).setContext(context);

        Message<IntegrationResult> message = connector.buildFlipJobMessage(request);

        Map<String, Object> outBoundVariables =  message.getPayload().getIntegrationContext().getOutBoundVariables();
        Boolean jobSuccessOutput = (Boolean) outBoundVariables.get("jobStartSuccess");
        Error errorOutput = (Error) outBoundVariables.get("error");

        assertFalse(jobSuccessOutput);
        assertEquals("Job ID not found in integration context inbound variables", errorOutput.getMessage());
    }
}
