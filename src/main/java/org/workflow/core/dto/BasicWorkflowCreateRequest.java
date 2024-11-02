package org.workflow.core.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.workflow.core.core.BasicWorkflow;
import org.workflow.core.core.Workflow;
import org.workflow.core.core.WorkflowStatus;

import java.time.Instant;
import java.util.Random;

@Getter
@Setter
@Builder
public class BasicWorkflowCreateRequest {
    private String name;
    private String description;
    private WorkflowStatus workflowStatus;

    public static Workflow toBasicWorkflow(BasicWorkflowCreateRequest workflowCreateRequest) {
        return BasicWorkflow.builder()
                .id(new Random().nextInt() & Integer.MAX_VALUE)
                .createdAt(Instant.now())
                .workflowStatus(workflowCreateRequest.getWorkflowStatus())
                .lastUpdateAt(Instant.now())
                .name(workflowCreateRequest.getName())
                .description(workflowCreateRequest.getDescription())
                .build();
    }
}
