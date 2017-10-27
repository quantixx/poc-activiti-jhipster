package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quantixx.sponsor.client.activiti.model.TypeIdResolver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TypeDeserializer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class TypeDeserializer   {
  @JsonProperty("propertyName")
  private String propertyName = null;

  @JsonProperty("typeIdResolver")
  private TypeIdResolver typeIdResolver = null;

  /**
   * Gets or Sets typeInclusion
   */
  public enum TypeInclusionEnum {
    PROPERTY("PROPERTY"),
    
    WRAPPER_OBJECT("WRAPPER_OBJECT"),
    
    WRAPPER_ARRAY("WRAPPER_ARRAY"),
    
    EXTERNAL_PROPERTY("EXTERNAL_PROPERTY"),
    
    EXISTING_PROPERTY("EXISTING_PROPERTY");

    private String value;

    TypeInclusionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeInclusionEnum fromValue(String text) {
      for (TypeInclusionEnum b : TypeInclusionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeInclusion")
  private TypeInclusionEnum typeInclusion = null;

  public TypeDeserializer propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @ApiModelProperty(value = "")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public TypeDeserializer typeIdResolver(TypeIdResolver typeIdResolver) {
    this.typeIdResolver = typeIdResolver;
    return this;
  }

   /**
   * Get typeIdResolver
   * @return typeIdResolver
  **/
  @ApiModelProperty(value = "")
  public TypeIdResolver getTypeIdResolver() {
    return typeIdResolver;
  }

  public void setTypeIdResolver(TypeIdResolver typeIdResolver) {
    this.typeIdResolver = typeIdResolver;
  }

  public TypeDeserializer typeInclusion(TypeInclusionEnum typeInclusion) {
    this.typeInclusion = typeInclusion;
    return this;
  }

   /**
   * Get typeInclusion
   * @return typeInclusion
  **/
  @ApiModelProperty(value = "")
  public TypeInclusionEnum getTypeInclusion() {
    return typeInclusion;
  }

  public void setTypeInclusion(TypeInclusionEnum typeInclusion) {
    this.typeInclusion = typeInclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeDeserializer typeDeserializer = (TypeDeserializer) o;
    return Objects.equals(this.propertyName, typeDeserializer.propertyName) &&
        Objects.equals(this.typeIdResolver, typeDeserializer.typeIdResolver) &&
        Objects.equals(this.typeInclusion, typeDeserializer.typeInclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, typeIdResolver, typeInclusion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeDeserializer {\n");
    
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    typeIdResolver: ").append(toIndentedString(typeIdResolver)).append("\n");
    sb.append("    typeInclusion: ").append(toIndentedString(typeInclusion)).append("\n");
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

