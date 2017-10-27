package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.Link;
import io.quantixx.sponsor.client.activiti.model.PageMetadata;
import io.quantixx.sponsor.client.activiti.model.ProcessInstanceResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PagedResourcesProcessInstanceResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class PagedResourcesProcessInstanceResource   {
  @JsonProperty("content")
  private List<ProcessInstanceResource> content = new ArrayList<ProcessInstanceResource>();

  @JsonProperty("links")
  private List<Link> links = new ArrayList<Link>();

  @JsonProperty("page")
  private PageMetadata page = null;

  public PagedResourcesProcessInstanceResource content(List<ProcessInstanceResource> content) {
    this.content = content;
    return this;
  }

  public PagedResourcesProcessInstanceResource addContentItem(ProcessInstanceResource contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public List<ProcessInstanceResource> getContent() {
    return content;
  }

  public void setContent(List<ProcessInstanceResource> content) {
    this.content = content;
  }

  public PagedResourcesProcessInstanceResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public PagedResourcesProcessInstanceResource addLinksItem(Link linksItem) {
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

  public PagedResourcesProcessInstanceResource page(PageMetadata page) {
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
    PagedResourcesProcessInstanceResource pagedResourcesProcessInstanceResource = (PagedResourcesProcessInstanceResource) o;
    return Objects.equals(this.content, pagedResourcesProcessInstanceResource.content) &&
        Objects.equals(this.links, pagedResourcesProcessInstanceResource.links) &&
        Objects.equals(this.page, pagedResourcesProcessInstanceResource.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesProcessInstanceResource {\n");
    
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

