package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.AnnotatedElement;
import io.quantixx.sponsor.client.activiti.model.AnnotationMap;
import io.quantixx.sponsor.client.activiti.model.JavaType;
import io.quantixx.sponsor.client.activiti.model.Member;
import io.quantixx.sponsor.client.activiti.model.Type;
import io.quantixx.sponsor.client.activiti.model.TypeResolutionContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AnnotatedMember
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class AnnotatedMember   {
  @JsonProperty("allAnnotations")
  private AnnotationMap allAnnotations = null;

  @JsonProperty("annotated")
  private AnnotatedElement annotated = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("genericType")
  private Type genericType = null;

  @JsonProperty("member")
  private Member member = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("public")
  private Boolean _public = null;

  @JsonProperty("type")
  private JavaType type = null;

  @JsonProperty("typeContext")
  private TypeResolutionContext typeContext = null;

  public AnnotatedMember allAnnotations(AnnotationMap allAnnotations) {
    this.allAnnotations = allAnnotations;
    return this;
  }

   /**
   * Get allAnnotations
   * @return allAnnotations
  **/
  @ApiModelProperty(value = "")
  public AnnotationMap getAllAnnotations() {
    return allAnnotations;
  }

  public void setAllAnnotations(AnnotationMap allAnnotations) {
    this.allAnnotations = allAnnotations;
  }

  public AnnotatedMember annotated(AnnotatedElement annotated) {
    this.annotated = annotated;
    return this;
  }

   /**
   * Get annotated
   * @return annotated
  **/
  @ApiModelProperty(value = "")
  public AnnotatedElement getAnnotated() {
    return annotated;
  }

  public void setAnnotated(AnnotatedElement annotated) {
    this.annotated = annotated;
  }

  public AnnotatedMember fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public AnnotatedMember genericType(Type genericType) {
    this.genericType = genericType;
    return this;
  }

   /**
   * Get genericType
   * @return genericType
  **/
  @ApiModelProperty(value = "")
  public Type getGenericType() {
    return genericType;
  }

  public void setGenericType(Type genericType) {
    this.genericType = genericType;
  }

  public AnnotatedMember member(Member member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public AnnotatedMember name(String name) {
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

  public AnnotatedMember _public(Boolean _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  @ApiModelProperty(value = "")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public AnnotatedMember type(JavaType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public JavaType getType() {
    return type;
  }

  public void setType(JavaType type) {
    this.type = type;
  }

  public AnnotatedMember typeContext(TypeResolutionContext typeContext) {
    this.typeContext = typeContext;
    return this;
  }

   /**
   * Get typeContext
   * @return typeContext
  **/
  @ApiModelProperty(value = "")
  public TypeResolutionContext getTypeContext() {
    return typeContext;
  }

  public void setTypeContext(TypeResolutionContext typeContext) {
    this.typeContext = typeContext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotatedMember annotatedMember = (AnnotatedMember) o;
    return Objects.equals(this.allAnnotations, annotatedMember.allAnnotations) &&
        Objects.equals(this.annotated, annotatedMember.annotated) &&
        Objects.equals(this.fullName, annotatedMember.fullName) &&
        Objects.equals(this.genericType, annotatedMember.genericType) &&
        Objects.equals(this.member, annotatedMember.member) &&
        Objects.equals(this.name, annotatedMember.name) &&
        Objects.equals(this._public, annotatedMember._public) &&
        Objects.equals(this.type, annotatedMember.type) &&
        Objects.equals(this.typeContext, annotatedMember.typeContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allAnnotations, annotated, fullName, genericType, member, name, _public, type, typeContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotatedMember {\n");
    
    sb.append("    allAnnotations: ").append(toIndentedString(allAnnotations)).append("\n");
    sb.append("    annotated: ").append(toIndentedString(annotated)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    genericType: ").append(toIndentedString(genericType)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeContext: ").append(toIndentedString(typeContext)).append("\n");
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

