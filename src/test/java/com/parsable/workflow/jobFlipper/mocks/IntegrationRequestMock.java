package com.parsable.workflow.jobFlipper.mocks;

import org.activiti.api.process.model.IntegrationContext;
import org.activiti.cloud.api.process.model.IntegrationRequest;

public class IntegrationRequestMock implements IntegrationRequest {

    public String getAppName() {
        return "test app name";
    }

    public String getAppVersion() {
        return "test app version";
    }

    public String getServiceName() {
        return "test service name";
    }

    public String getServiceFullName() {
        return "test service full name";
    }

    public String getServiceType() {
        return "test service type";
    }

    public String getServiceVersion() {
        return "test service version";
    }

    private IntegrationContext context;

    public void setContext(IntegrationContext context) {
        this.context = context;
    }

    public IntegrationContext getIntegrationContext() {
        return context;
    }
}
