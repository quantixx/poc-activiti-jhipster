package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quantixx.sponsor.client.activiti.model.JsonDeserializerobject;
import io.quantixx.sponsor.client.activiti.model.ObjectIdReader;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionUserTask;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessDefinitionUserTask
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class ProcessDefinitionUserTask   {
  @JsonProperty("cachable")
  private Boolean cachable = null;

  @JsonProperty("delegatee")
  private JsonDeserializerobject delegatee = null;

  /**
   * Gets or Sets emptyAccessPattern
   */
  public enum EmptyAccessPatternEnum {
    ALWAYS_NULL("ALWAYS_NULL"),
    
    CONSTANT("CONSTANT"),
    
    DYNAMIC("DYNAMIC");

    private String value;

    EmptyAccessPatternEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmptyAccessPatternEnum fromValue(String text) {
      for (EmptyAccessPatternEnum b : EmptyAccessPatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("emptyAccessPattern")
  private EmptyAccessPatternEnum emptyAccessPattern = null;

  @JsonProperty("emptyValue")
  private Object emptyValue = null;

  @JsonProperty("knownPropertyNames")
  private List<Object> knownPropertyNames = new ArrayList<Object>();

  /**
   * Gets or Sets nullAccessPattern
   */
  public enum NullAccessPatternEnum {
    ALWAYS_NULL("ALWAYS_NULL"),
    
    CONSTANT("CONSTANT"),
    
    DYNAMIC("DYNAMIC");

    private String value;

    NullAccessPatternEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NullAccessPatternEnum fromValue(String text) {
      for (NullAccessPatternEnum b : NullAccessPatternEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nullAccessPattern")
  private NullAccessPatternEnum nullAccessPattern = null;

  @JsonProperty("nullValue")
  private List<ProcessDefinitionUserTask> nullValue = new ArrayList<ProcessDefinitionUserTask>();

  @JsonProperty("objectIdReader")
  private ObjectIdReader objectIdReader = null;

  @JsonProperty("taskDocumentation")
  private String taskDocumentation = null;

  @JsonProperty("taskName")
  private String taskName = null;

  public ProcessDefinitionUserTask cachable(Boolean cachable) {
    this.cachable = cachable;
    return this;
  }

   /**
   * Get cachable
   * @return cachable
  **/
  @ApiModelProperty(value = "")
  public Boolean getCachable() {
    return cachable;
  }

  public void setCachable(Boolean cachable) {
    this.cachable = cachable;
  }

  public ProcessDefinitionUserTask delegatee(JsonDeserializerobject delegatee) {
    this.delegatee = delegatee;
    return this;
  }

   /**
   * Get delegatee
   * @return delegatee
  **/
  @ApiModelProperty(value = "")
  public JsonDeserializerobject getDelegatee() {
    return delegatee;
  }

  public void setDelegatee(JsonDeserializerobject delegatee) {
    this.delegatee = delegatee;
  }

  public ProcessDefinitionUserTask emptyAccessPattern(EmptyAccessPatternEnum emptyAccessPattern) {
    this.emptyAccessPattern = emptyAccessPattern;
    return this;
  }

   /**
   * Get emptyAccessPattern
   * @return emptyAccessPattern
  **/
  @ApiModelProperty(value = "")
  public EmptyAccessPatternEnum getEmptyAccessPattern() {
    return emptyAccessPattern;
  }

  public void setEmptyAccessPattern(EmptyAccessPatternEnum emptyAccessPattern) {
    this.emptyAccessPattern = emptyAccessPattern;
  }

  public ProcessDefinitionUserTask emptyValue(Object emptyValue) {
    this.emptyValue = emptyValue;
    return this;
  }

   /**
   * Get emptyValue
   * @return emptyValue
  **/
  @ApiModelProperty(value = "")
  public Object getEmptyValue() {
    return emptyValue;
  }

  public void setEmptyValue(Object emptyValue) {
    this.emptyValue = emptyValue;
  }

  public ProcessDefinitionUserTask knownPropertyNames(List<Object> knownPropertyNames) {
    this.knownPropertyNames = knownPropertyNames;
    return this;
  }

  public ProcessDefinitionUserTask addKnownPropertyNamesItem(Object knownPropertyNamesItem) {
    this.knownPropertyNames.add(knownPropertyNamesItem);
    return this;
  }

   /**
   * Get knownPropertyNames
   * @return knownPropertyNames
  **/
  @ApiModelProperty(value = "")
  public List<Object> getKnownPropertyNames() {
    return knownPropertyNames;
  }

  public void setKnownPropertyNames(List<Object> knownPropertyNames) {
    this.knownPropertyNames = knownPropertyNames;
  }

  public ProcessDefinitionUserTask nullAccessPattern(NullAccessPatternEnum nullAccessPattern) {
    this.nullAccessPattern = nullAccessPattern;
    return this;
  }

   /**
   * Get nullAccessPattern
   * @return nullAccessPattern
  **/
  @ApiModelProperty(value = "")
  public NullAccessPatternEnum getNullAccessPattern() {
    return nullAccessPattern;
  }

  public void setNullAccessPattern(NullAccessPatternEnum nullAccessPattern) {
    this.nullAccessPattern = nullAccessPattern;
  }

  public ProcessDefinitionUserTask nullValue(List<ProcessDefinitionUserTask> nullValue) {
    this.nullValue = nullValue;
    return this;
  }

  public ProcessDefinitionUserTask addNullValueItem(ProcessDefinitionUserTask nullValueItem) {
    this.nullValue.add(nullValueItem);
    return this;
  }

   /**
   * Get nullValue
   * @return nullValue
  **/
  @ApiModelProperty(value = "")
  public List<ProcessDefinitionUserTask> getNullValue() {
    return nullValue;
  }

  public void setNullValue(List<ProcessDefinitionUserTask> nullValue) {
    this.nullValue = nullValue;
  }

  public ProcessDefinitionUserTask objectIdReader(ObjectIdReader objectIdReader) {
    this.objectIdReader = objectIdReader;
    return this;
  }

   /**
   * Get objectIdReader
   * @return objectIdReader
  **/
  @ApiModelProperty(value = "")
  public ObjectIdReader getObjectIdReader() {
    return objectIdReader;
  }

  public void setObjectIdReader(ObjectIdReader objectIdReader) {
    this.objectIdReader = objectIdReader;
  }

  public ProcessDefinitionUserTask taskDocumentation(String taskDocumentation) {
    this.taskDocumentation = taskDocumentation;
    return this;
  }

   /**
   * Get taskDocumentation
   * @return taskDocumentation
  **/
  @ApiModelProperty(value = "")
  public String getTaskDocumentation() {
    return taskDocumentation;
  }

  public void setTaskDocumentation(String taskDocumentation) {
    this.taskDocumentation = taskDocumentation;
  }

  public ProcessDefinitionUserTask taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionUserTask processDefinitionUserTask = (ProcessDefinitionUserTask) o;
    return Objects.equals(this.cachable, processDefinitionUserTask.cachable) &&
        Objects.equals(this.delegatee, processDefinitionUserTask.delegatee) &&
        Objects.equals(this.emptyAccessPattern, processDefinitionUserTask.emptyAccessPattern) &&
        Objects.equals(this.emptyValue, processDefinitionUserTask.emptyValue) &&
        Objects.equals(this.knownPropertyNames, processDefinitionUserTask.knownPropertyNames) &&
        Objects.equals(this.nullAccessPattern, processDefinitionUserTask.nullAccessPattern) &&
        Objects.equals(this.nullValue, processDefinitionUserTask.nullValue) &&
        Objects.equals(this.objectIdReader, processDefinitionUserTask.objectIdReader) &&
        Objects.equals(this.taskDocumentation, processDefinitionUserTask.taskDocumentation) &&
        Objects.equals(this.taskName, processDefinitionUserTask.taskName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachable, delegatee, emptyAccessPattern, emptyValue, knownPropertyNames, nullAccessPattern, nullValue, objectIdReader, taskDocumentation, taskName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionUserTask {\n");
    
    sb.append("    cachable: ").append(toIndentedString(cachable)).append("\n");
    sb.append("    delegatee: ").append(toIndentedString(delegatee)).append("\n");
    sb.append("    emptyAccessPattern: ").append(toIndentedString(emptyAccessPattern)).append("\n");
    sb.append("    emptyValue: ").append(toIndentedString(emptyValue)).append("\n");
    sb.append("    knownPropertyNames: ").append(toIndentedString(knownPropertyNames)).append("\n");
    sb.append("    nullAccessPattern: ").append(toIndentedString(nullAccessPattern)).append("\n");
    sb.append("    nullValue: ").append(toIndentedString(nullValue)).append("\n");
    sb.append("    objectIdReader: ").append(toIndentedString(objectIdReader)).append("\n");
    sb.append("    taskDocumentation: ").append(toIndentedString(taskDocumentation)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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

