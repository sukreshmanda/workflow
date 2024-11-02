package org.workflow.core.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.workflow.core.dto.BasicWorkflowCreateRequest;
import org.workflow.core.dto.BasicWorkflowResponse;
import org.workflow.core.services.WorkflowBasicService;

@RestController("api/v1/workflows")
public class WorkflowController {

    private final WorkflowBasicService workflowBasicService;

    @Autowired
    public WorkflowController(WorkflowBasicService workflowBasicService) {
        this.workflowBasicService = workflowBasicService;
    }

    @GetMapping("{id}")
    public BasicWorkflowResponse getWorkflow(@PathVariable long id) {
        return workflowBasicService.getWorkflowById(id);
    }

    @PostMapping("")
    public BasicWorkflowResponse createWorkflow(@RequestBody BasicWorkflowCreateRequest workflowCreateRequest){
        return workflowBasicService.createWorkflow(workflowCreateRequest);
    }
}
