package org.workflow.core.services;

import org.workflow.core.dto.BasicWorkflowCreateRequest;
import org.workflow.core.dto.BasicWorkflowResponse;

public interface WorkflowService {
    BasicWorkflowResponse getWorkflowById(long id);

    BasicWorkflowResponse createWorkflow(BasicWorkflowCreateRequest workflowCreateRequest);
}
