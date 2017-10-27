package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CompleteTaskCmd
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class CompleteTaskCmd   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("outputVariables")
  private Object outputVariables = null;

  public CompleteTaskCmd id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CompleteTaskCmd taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @ApiModelProperty(value = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public CompleteTaskCmd outputVariables(Object outputVariables) {
    this.outputVariables = outputVariables;
    return this;
  }

   /**
   * Get outputVariables
   * @return outputVariables
  **/
  @ApiModelProperty(value = "")
  public Object getOutputVariables() {
    return outputVariables;
  }

  public void setOutputVariables(Object outputVariables) {
    this.outputVariables = outputVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteTaskCmd completeTaskCmd = (CompleteTaskCmd) o;
    return Objects.equals(this.id, completeTaskCmd.id) &&
        Objects.equals(this.taskId, completeTaskCmd.taskId) &&
        Objects.equals(this.outputVariables, completeTaskCmd.outputVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskId, outputVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteTaskCmd {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    outputVariables: ").append(toIndentedString(outputVariables)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

