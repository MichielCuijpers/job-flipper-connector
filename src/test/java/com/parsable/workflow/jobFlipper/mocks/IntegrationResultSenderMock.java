package com.parsable.workflow.jobFlipper.mocks;

import org.activiti.cloud.connectors.starter.channels.IntegrationResultSender;
import org.springframework.messaging.Message;
import org.activiti.cloud.api.process.model.IntegrationResult;

import java.util.LinkedList;
import java.util.List;

public class IntegrationResultSenderMock implements IntegrationResultSender {
    private List<Message<IntegrationResult>> messages = new LinkedList<Message<IntegrationResult>>();

    public List<Message<IntegrationResult>> getMessages() {
        return messages;
    }

    public void send(Message<IntegrationResult> message) {
        messages.add(message);
    }
}
