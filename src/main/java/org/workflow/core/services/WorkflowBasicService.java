package org.workflow.core.services;

import org.springframework.stereotype.Service;
import org.workflow.core.core.Workflow;
import org.workflow.core.dto.BasicWorkflowCreateRequest;
import org.workflow.core.dto.BasicWorkflowResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkflowBasicService implements WorkflowService {
    private List<Workflow> workflowsList;

    public WorkflowBasicService() {
        this.workflowsList = new ArrayList<>();
    }

    @Override
    public BasicWorkflowResponse getWorkflowById(long id) {
        return workflowsList.stream().filter(w -> w.getId() == id)
                .findFirst()
                .map(BasicWorkflowResponse::fromWorkflow)
                .orElse(BasicWorkflowResponse.emptyResponse());
    }

    @Override
    public BasicWorkflowResponse createWorkflow(BasicWorkflowCreateRequest workflowCreateRequest) {
        Workflow basicWorkflow = BasicWorkflowCreateRequest.toBasicWorkflow(workflowCreateRequest);
        workflowsList.add(basicWorkflow);
        return BasicWorkflowResponse.fromWorkflow(basicWorkflow);
    }
}
