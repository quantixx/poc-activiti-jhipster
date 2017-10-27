package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.Link;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionServiceTask;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionUserTask;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionVariable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessDefinitionMetaResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class ProcessDefinitionMetaResource   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("groups")
  private List<String> groups = new ArrayList<String>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("links")
  private List<Link> links = new ArrayList<Link>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("serviceTasks")
  private List<ProcessDefinitionServiceTask> serviceTasks = new ArrayList<ProcessDefinitionServiceTask>();

  @JsonProperty("userTasks")
  private List<ProcessDefinitionUserTask> userTasks = new ArrayList<ProcessDefinitionUserTask>();

  @JsonProperty("users")
  private List<String> users = new ArrayList<String>();

  @JsonProperty("variables")
  private List<ProcessDefinitionVariable> variables = new ArrayList<ProcessDefinitionVariable>();

  @JsonProperty("version")
  private Integer version = null;

  public ProcessDefinitionMetaResource description(String description) {
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

  public ProcessDefinitionMetaResource groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ProcessDefinitionMetaResource addGroupsItem(String groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ProcessDefinitionMetaResource id(String id) {
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

  public ProcessDefinitionMetaResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ProcessDefinitionMetaResource addLinksItem(Link linksItem) {
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

  public ProcessDefinitionMetaResource name(String name) {
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

  public ProcessDefinitionMetaResource serviceTasks(List<ProcessDefinitionServiceTask> serviceTasks) {
    this.serviceTasks = serviceTasks;
    return this;
  }

  public ProcessDefinitionMetaResource addServiceTasksItem(ProcessDefinitionServiceTask serviceTasksItem) {
    this.serviceTasks.add(serviceTasksItem);
    return this;
  }

   /**
   * Get serviceTasks
   * @return serviceTasks
  **/
  @ApiModelProperty(value = "")
  public List<ProcessDefinitionServiceTask> getServiceTasks() {
    return serviceTasks;
  }

  public void setServiceTasks(List<ProcessDefinitionServiceTask> serviceTasks) {
    this.serviceTasks = serviceTasks;
  }

  public ProcessDefinitionMetaResource userTasks(List<ProcessDefinitionUserTask> userTasks) {
    this.userTasks = userTasks;
    return this;
  }

  public ProcessDefinitionMetaResource addUserTasksItem(ProcessDefinitionUserTask userTasksItem) {
    this.userTasks.add(userTasksItem);
    return this;
  }

   /**
   * Get userTasks
   * @return userTasks
  **/
  @ApiModelProperty(value = "")
  public List<ProcessDefinitionUserTask> getUserTasks() {
    return userTasks;
  }

  public void setUserTasks(List<ProcessDefinitionUserTask> userTasks) {
    this.userTasks = userTasks;
  }

  public ProcessDefinitionMetaResource users(List<String> users) {
    this.users = users;
    return this;
  }

  public ProcessDefinitionMetaResource addUsersItem(String usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  public ProcessDefinitionMetaResource variables(List<ProcessDefinitionVariable> variables) {
    this.variables = variables;
    return this;
  }

  public ProcessDefinitionMetaResource addVariablesItem(ProcessDefinitionVariable variablesItem) {
    this.variables.add(variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(value = "")
  public List<ProcessDefinitionVariable> getVariables() {
    return variables;
  }

  public void setVariables(List<ProcessDefinitionVariable> variables) {
    this.variables = variables;
  }

  public ProcessDefinitionMetaResource version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessDefinitionMetaResource processDefinitionMetaResource = (ProcessDefinitionMetaResource) o;
    return Objects.equals(this.description, processDefinitionMetaResource.description) &&
        Objects.equals(this.groups, processDefinitionMetaResource.groups) &&
        Objects.equals(this.id, processDefinitionMetaResource.id) &&
        Objects.equals(this.links, processDefinitionMetaResource.links) &&
        Objects.equals(this.name, processDefinitionMetaResource.name) &&
        Objects.equals(this.serviceTasks, processDefinitionMetaResource.serviceTasks) &&
        Objects.equals(this.userTasks, processDefinitionMetaResource.userTasks) &&
        Objects.equals(this.users, processDefinitionMetaResource.users) &&
        Objects.equals(this.variables, processDefinitionMetaResource.variables) &&
        Objects.equals(this.version, processDefinitionMetaResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, groups, id, links, name, serviceTasks, userTasks, users, variables, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessDefinitionMetaResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceTasks: ").append(toIndentedString(serviceTasks)).append("\n");
    sb.append("    userTasks: ").append(toIndentedString(userTasks)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

