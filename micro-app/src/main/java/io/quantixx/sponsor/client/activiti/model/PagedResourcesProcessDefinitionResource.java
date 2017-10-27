package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.Link;
import io.quantixx.sponsor.client.activiti.model.PageMetadata;
import io.quantixx.sponsor.client.activiti.model.ProcessDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PagedResourcesProcessDefinitionResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class PagedResourcesProcessDefinitionResource   {
  @JsonProperty("content")
  private List<ProcessDefinitionResource> content = new ArrayList<ProcessDefinitionResource>();

  @JsonProperty("links")
  private List<Link> links = new ArrayList<Link>();

  @JsonProperty("page")
  private PageMetadata page = null;

  public PagedResourcesProcessDefinitionResource content(List<ProcessDefinitionResource> content) {
    this.content = content;
    return this;
  }

  public PagedResourcesProcessDefinitionResource addContentItem(ProcessDefinitionResource contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<ProcessDefinitionResource> getContent() {
    return content;
  }

  public void setContent(List<ProcessDefinitionResource> content) {
    this.content = content;
  }

  public PagedResourcesProcessDefinitionResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public PagedResourcesProcessDefinitionResource addLinksItem(Link linksItem) {
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

  public PagedResourcesProcessDefinitionResource page(PageMetadata page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public PageMetadata getPage() {
    return page;
  }

  public void setPage(PageMetadata page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResourcesProcessDefinitionResource pagedResourcesProcessDefinitionResource = (PagedResourcesProcessDefinitionResource) o;
    return Objects.equals(this.content, pagedResourcesProcessDefinitionResource.content) &&
        Objects.equals(this.links, pagedResourcesProcessDefinitionResource.links) &&
        Objects.equals(this.page, pagedResourcesProcessDefinitionResource.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesProcessDefinitionResource {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

