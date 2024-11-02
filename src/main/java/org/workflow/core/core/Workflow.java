package org.workflow.core.core;

import java.time.Instant;

public interface Workflow {
    long getId();

    String getName();

    String getDescription();

    WorkflowStatus getWorkflowStatus();

    Instant getCreatedAt();

    Instant getLastUpdatedAt();
}
