package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ResourceTask
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class ResourceTask   {
  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("claimedDate")
  private OffsetDateTime claimedDate = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("links")
  private List<Link> links = new ArrayList<Link>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private String owner = null;

  @JsonProperty("parentTaskId")
  private String parentTaskId = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("processDefinitionId")
  private String processDefinitionId = null;

  @JsonProperty("processInstanceId")
  private String processInstanceId = null;

  @JsonProperty("status")
  private String status = null;

  public ResourceTask assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public ResourceTask claimedDate(OffsetDateTime claimedDate) {
    this.claimedDate = claimedDate;
    return this;
  }

   /**
   * Get claimedDate
   * @return claimedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getClaimedDate() {
    return claimedDate;
  }

  public void setClaimedDate(OffsetDateTime claimedDate) {
    this.claimedDate = claimedDate;
  }

  public ResourceTask createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ResourceTask description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResourceTask dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public ResourceTask id(String id) {
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

  public ResourceTask links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ResourceTask addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public ResourceTask name(String name) {
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

  public ResourceTask owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public ResourceTask parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

   /**
   * Get parentTaskId
   * @return parentTaskId
  **/
  @ApiModelProperty(value = "")
  public String getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public ResourceTask priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ResourceTask processDefinitionId(String processDefinitionId) {
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

  public ResourceTask processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * Get processInstanceId
   * @return processInstanceId
  **/
  @ApiModelProperty(value = "")
  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }

  public ResourceTask status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTask resourceTask = (ResourceTask) o;
    return Objects.equals(this.assignee, resourceTask.assignee) &&
        Objects.equals(this.claimedDate, resourceTask.claimedDate) &&
        Objects.equals(this.createdDate, resourceTask.createdDate) &&
        Objects.equals(this.description, resourceTask.description) &&
        Objects.equals(this.dueDate, resourceTask.dueDate) &&
        Objects.equals(this.id, resourceTask.id) &&
        Objects.equals(this.links, resourceTask.links) &&
        Objects.equals(this.name, resourceTask.name) &&
        Objects.equals(this.owner, resourceTask.owner) &&
        Objects.equals(this.parentTaskId, resourceTask.parentTaskId) &&
        Objects.equals(this.priority, resourceTask.priority) &&
        Objects.equals(this.processDefinitionId, resourceTask.processDefinitionId) &&
        Objects.equals(this.processInstanceId, resourceTask.processInstanceId) &&
        Objects.equals(this.status, resourceTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, claimedDate, createdDate, description, dueDate, id, links, name, owner, parentTaskId, priority, processDefinitionId, processInstanceId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTask {\n");
    
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    claimedDate: ").append(toIndentedString(claimedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

