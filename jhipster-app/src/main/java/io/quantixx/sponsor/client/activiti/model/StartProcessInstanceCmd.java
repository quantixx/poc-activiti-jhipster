package io.quantixx.sponsor.client.activiti.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * StartProcessInstanceCmd
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class StartProcessInstanceCmd   {

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("variables")
  private Object variables = null;

  @JsonProperty("commandType")
  private String commandType = null;

  public StartProcessInstanceCmd id() {
    return this;
  }

  public StartProcessInstanceCmd processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * Get processDefinitionId
   * @return processDefinitionId
  **/
  @ApiModelProperty(value = "")
  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }

  public StartProcessInstanceCmd variables(Object variables) {
    this.variables = variables;
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")
  public Object getVariables() {
    return variables;
  }

  public void setVariables(Object variables) {
    this.variables = variables;
  }


    @ApiModelProperty(value = "")
    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartProcessInstanceCmd startProcessInstanceCmd = (StartProcessInstanceCmd) o;
    return
        Objects.equals(this.processDefinitionId, startProcessInstanceCmd.processDefinitionId) &&
        Objects.equals(this.variables, startProcessInstanceCmd.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processDefinitionId, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartProcessInstanceCmd {\n");

    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
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

