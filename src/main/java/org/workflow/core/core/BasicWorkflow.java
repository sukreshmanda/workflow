package org.workflow.core.core;

import lombok.Builder;

import java.time.Instant;

@Builder
public class BasicWorkflow implements Workflow {
    private long id;
    private String name;
    private String description;
    private WorkflowStatus workflowStatus;
    private Instant createdAt;
    private Instant lastUpdateAt;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public WorkflowStatus getWorkflowStatus() {
        return workflowStatus;
    }

    @Override
    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public Instant getLastUpdatedAt() {
        return lastUpdateAt;
    }
}
