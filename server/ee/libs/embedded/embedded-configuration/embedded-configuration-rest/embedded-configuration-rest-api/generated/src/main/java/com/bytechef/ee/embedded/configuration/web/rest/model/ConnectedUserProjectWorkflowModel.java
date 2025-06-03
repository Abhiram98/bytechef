package com.bytechef.ee.embedded.configuration.web.rest.model;

import java.net.URI;
import java.util.Objects;
import com.bytechef.ee.embedded.configuration.web.rest.model.Workflow1Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConnectedUserProjectWorkflowModel
 */

@JsonTypeName("ConnectedUserProjectWorkflow")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-02T11:39:15.591010+02:00[Europe/Zagreb]", comments = "Generator version: 7.12.0")
public class ConnectedUserProjectWorkflowModel {

  private @Nullable Long connectedUserId;

  private @Nullable Long projectId;

  private @Nullable Workflow1Model workflow;

  public ConnectedUserProjectWorkflowModel connectedUserId(Long connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

  /**
   * The connected user id
   * @return connectedUserId
   */
  
  @Schema(name = "connectedUserId", description = "The connected user id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectedUserId")
  public Long getConnectedUserId() {
    return connectedUserId;
  }

  public void setConnectedUserId(Long connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  public ConnectedUserProjectWorkflowModel projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The project id
   * @return projectId
   */
  
  @Schema(name = "projectId", description = "The project id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ConnectedUserProjectWorkflowModel workflow(Workflow1Model workflow) {
    this.workflow = workflow;
    return this;
  }

  /**
   * Get workflow
   * @return workflow
   */
  @Valid 
  @Schema(name = "workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflow")
  public Workflow1Model getWorkflow() {
    return workflow;
  }

  public void setWorkflow(Workflow1Model workflow) {
    this.workflow = workflow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedUserProjectWorkflowModel connectedUserProjectWorkflow = (ConnectedUserProjectWorkflowModel) o;
    return Objects.equals(this.connectedUserId, connectedUserProjectWorkflow.connectedUserId) &&
        Objects.equals(this.projectId, connectedUserProjectWorkflow.projectId) &&
        Objects.equals(this.workflow, connectedUserProjectWorkflow.workflow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedUserId, projectId, workflow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedUserProjectWorkflowModel {\n");
    sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

