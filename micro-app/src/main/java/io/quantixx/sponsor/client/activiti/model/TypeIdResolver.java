package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TypeIdResolver
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class TypeIdResolver   {
  @JsonProperty("descForKnownTypeIds")
  private String descForKnownTypeIds = null;

  /**
   * Gets or Sets mechanism
   */
  public enum MechanismEnum {
    NONE("NONE"),
    
    CLASS("CLASS"),
    
    MINIMAL_CLASS("MINIMAL_CLASS"),
    
    NAME("NAME"),
    
    CUSTOM("CUSTOM");

    private String value;

    MechanismEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MechanismEnum fromValue(String text) {
      for (MechanismEnum b : MechanismEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mechanism")
  private MechanismEnum mechanism = null;

  public TypeIdResolver descForKnownTypeIds(String descForKnownTypeIds) {
    this.descForKnownTypeIds = descForKnownTypeIds;
    return this;
  }

   /**
   * Get descForKnownTypeIds
   * @return descForKnownTypeIds
  **/
  @ApiModelProperty(value = "")
  public String getDescForKnownTypeIds() {
    return descForKnownTypeIds;
  }

  public void setDescForKnownTypeIds(String descForKnownTypeIds) {
    this.descForKnownTypeIds = descForKnownTypeIds;
  }

  public TypeIdResolver mechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
    return this;
  }

   /**
   * Get mechanism
   * @return mechanism
  **/
  @ApiModelProperty(value = "")
  public MechanismEnum getMechanism() {
    return mechanism;
  }

  public void setMechanism(MechanismEnum mechanism) {
    this.mechanism = mechanism;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeIdResolver typeIdResolver = (TypeIdResolver) o;
    return Objects.equals(this.descForKnownTypeIds, typeIdResolver.descForKnownTypeIds) &&
        Objects.equals(this.mechanism, typeIdResolver.mechanism);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descForKnownTypeIds, mechanism);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeIdResolver {\n");
    
    sb.append("    descForKnownTypeIds: ").append(toIndentedString(descForKnownTypeIds)).append("\n");
    sb.append("    mechanism: ").append(toIndentedString(mechanism)).append("\n");
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

