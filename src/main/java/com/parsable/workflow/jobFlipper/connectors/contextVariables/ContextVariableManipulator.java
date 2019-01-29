package com.parsable.workflow.jobFlipper.connectors.contextVariables;

import org.activiti.api.process.model.IntegrationContext;
import org.activiti.cloud.api.process.model.IntegrationRequest;

public class ContextVariableManipulator {
    private static final String JOB_ID_ACCESSOR_TOKEN_PREFIX = "jobId::";

    public static String getJobIdForIntegrationRequest(IntegrationRequest event) {
        String jobIdAccessorToken = generateJobIdAccessorToken(event);
        Object jobIdObj = event.getIntegrationContext().getInBoundVariables().get(jobIdAccessorToken);

        if (jobIdObj == null) {
            return null;
        } else {
            return String.valueOf(jobIdObj);
        }
    }

    public static String generateJobIdAccessorToken(IntegrationRequest event) {
        IntegrationContext context = event.getIntegrationContext();
        String elementId = context.getActivityElementId();
        return JOB_ID_ACCESSOR_TOKEN_PREFIX + elementId;
    }
}
