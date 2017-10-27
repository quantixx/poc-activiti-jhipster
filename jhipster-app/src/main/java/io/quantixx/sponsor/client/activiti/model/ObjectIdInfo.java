package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.PropertyName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ObjectIdInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class ObjectIdInfo   {
  @JsonProperty("alwaysAsId")
  private Boolean alwaysAsId = null;

  @JsonProperty("propertyName")
  private PropertyName propertyName = null;

  public ObjectIdInfo alwaysAsId(Boolean alwaysAsId) {
    this.alwaysAsId = alwaysAsId;
    return this;
  }

   /**
   * Get alwaysAsId
   * @return alwaysAsId
  **/
  @ApiModelProperty(value = "")
  public Boolean getAlwaysAsId() {
    return alwaysAsId;
  }

  public void setAlwaysAsId(Boolean alwaysAsId) {
    this.alwaysAsId = alwaysAsId;
  }

  public ObjectIdInfo propertyName(PropertyName propertyName) {
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Get propertyName
   * @return propertyName
  **/
  @ApiModelProperty(value = "")
  public PropertyName getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(PropertyName propertyName) {
    this.propertyName = propertyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectIdInfo objectIdInfo = (ObjectIdInfo) o;
    return Objects.equals(this.alwaysAsId, objectIdInfo.alwaysAsId) &&
        Objects.equals(this.propertyName, objectIdInfo.propertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysAsId, propertyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectIdInfo {\n");
    
    sb.append("    alwaysAsId: ").append(toIndentedString(alwaysAsId)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
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

