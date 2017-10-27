package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.JavaType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TypeBindings
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class TypeBindings   {
  @JsonProperty("empty")
  private Boolean empty = null;

  @JsonProperty("typeParameters")
  private List<JavaType> typeParameters = new ArrayList<JavaType>();

  public TypeBindings empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @ApiModelProperty(value = "")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public TypeBindings typeParameters(List<JavaType> typeParameters) {
    this.typeParameters = typeParameters;
    return this;
  }

  public TypeBindings addTypeParametersItem(JavaType typeParametersItem) {
    this.typeParameters.add(typeParametersItem);
    return this;
  }

   /**
   * Get typeParameters
   * @return typeParameters
  **/
  @ApiModelProperty(value = "")
  public List<JavaType> getTypeParameters() {
    return typeParameters;
  }

  public void setTypeParameters(List<JavaType> typeParameters) {
    this.typeParameters = typeParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeBindings typeBindings = (TypeBindings) o;
    return Objects.equals(this.empty, typeBindings.empty) &&
        Objects.equals(this.typeParameters, typeBindings.typeParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, typeParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeBindings {\n");
    
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    typeParameters: ").append(toIndentedString(typeParameters)).append("\n");
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

