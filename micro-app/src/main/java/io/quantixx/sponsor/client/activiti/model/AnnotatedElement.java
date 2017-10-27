package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.Annotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AnnotatedElement
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class AnnotatedElement   {
  @JsonProperty("annotations")
  private List<Annotation> annotations = new ArrayList<Annotation>();

  @JsonProperty("declaredAnnotations")
  private List<Annotation> declaredAnnotations = new ArrayList<Annotation>();

  public AnnotatedElement annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public AnnotatedElement addAnnotationsItem(Annotation annotationsItem) {
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "")
  public List<Annotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  public AnnotatedElement declaredAnnotations(List<Annotation> declaredAnnotations) {
    this.declaredAnnotations = declaredAnnotations;
    return this;
  }

  public AnnotatedElement addDeclaredAnnotationsItem(Annotation declaredAnnotationsItem) {
    this.declaredAnnotations.add(declaredAnnotationsItem);
    return this;
  }

   /**
   * Get declaredAnnotations
   * @return declaredAnnotations
  **/
  @ApiModelProperty(value = "")
  public List<Annotation> getDeclaredAnnotations() {
    return declaredAnnotations;
  }

  public void setDeclaredAnnotations(List<Annotation> declaredAnnotations) {
    this.declaredAnnotations = declaredAnnotations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedElement annotatedElement = (AnnotatedElement) o;
    return Objects.equals(this.annotations, annotatedElement.annotations) &&
        Objects.equals(this.declaredAnnotations, annotatedElement.declaredAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, declaredAnnotations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedElement {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    declaredAnnotations: ").append(toIndentedString(declaredAnnotations)).append("\n");
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

