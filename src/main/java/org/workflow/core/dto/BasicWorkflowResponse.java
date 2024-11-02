package org.workflow.core.dto;

import lombok.*;
import org.workflow.core.core.Workflow;
import org.workflow.core.core.WorkflowStatus;

import java.time.Instant;
import java.util.Random;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BasicWorkflowResponse {
    private long id;
    private String name;
    private String description;
    private Instant createdAt;
    private WorkflowStatus workflowStatus;
    private Instant lastUpdatedAt;

    public static BasicWorkflowResponse emptyResponse() {
        return BasicWorkflowResponse.builder()
                .description("@@@_@@@_@@@")
                .createdAt(Instant.MIN)
                .workflowStatus(WorkflowStatus.INACTIVE)
                .lastUpdatedAt(Instant.MIN)
                .build();
    }

    public static BasicWorkflowResponse fromWorkflow(Workflow workflow) {
        return BasicWorkflowResponse.builder()
                .id(workflow.getId())
                .workflowStatus(workflow.getWorkflowStatus())
                .description(workflow.getDescription())
                .createdAt(workflow.getCreatedAt())
                .name(workflow.getName())
                .lastUpdatedAt(workflow.getLastUpdatedAt())
                .build();
    }
}
