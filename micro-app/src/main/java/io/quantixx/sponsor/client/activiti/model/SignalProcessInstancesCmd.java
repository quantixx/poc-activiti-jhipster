package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignalProcessInstancesCmd
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class SignalProcessInstancesCmd   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("inputVariables")
  private Object inputVariables = null;

  public SignalProcessInstancesCmd id(String id) {
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

  public SignalProcessInstancesCmd name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SignalProcessInstancesCmd inputVariables(Object inputVariables) {
    this.inputVariables = inputVariables;
    return this;
  }

   /**
   * Get inputVariables
   * @return inputVariables
  **/
  @ApiModelProperty(value = "")
  public Object getInputVariables() {
    return inputVariables;
  }

  public void setInputVariables(Object inputVariables) {
    this.inputVariables = inputVariables;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignalProcessInstancesCmd signalProcessInstancesCmd = (SignalProcessInstancesCmd) o;
    return Objects.equals(this.id, signalProcessInstancesCmd.id) &&
        Objects.equals(this.name, signalProcessInstancesCmd.name) &&
        Objects.equals(this.inputVariables, signalProcessInstancesCmd.inputVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, inputVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignalProcessInstancesCmd {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputVariables: ").append(toIndentedString(inputVariables)).append("\n");
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

