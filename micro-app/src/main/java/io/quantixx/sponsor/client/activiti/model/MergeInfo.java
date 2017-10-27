package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.AnnotatedMember;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MergeInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class MergeInfo   {
  @JsonProperty("fromDefaults")
  private Boolean fromDefaults = null;

  @JsonProperty("getter")
  private AnnotatedMember getter = null;

  public MergeInfo fromDefaults(Boolean fromDefaults) {
    this.fromDefaults = fromDefaults;
    return this;
  }

   /**
   * Get fromDefaults
   * @return fromDefaults
  **/
  @ApiModelProperty(value = "")
  public Boolean getFromDefaults() {
    return fromDefaults;
  }

  public void setFromDefaults(Boolean fromDefaults) {
    this.fromDefaults = fromDefaults;
  }

  public MergeInfo getter(AnnotatedMember getter) {
    this.getter = getter;
    return this;
  }

   /**
   * Get getter
   * @return getter
  **/
  @ApiModelProperty(value = "")
  public AnnotatedMember getGetter() {
    return getter;
  }

  public void setGetter(AnnotatedMember getter) {
    this.getter = getter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeInfo mergeInfo = (MergeInfo) o;
    return Objects.equals(this.fromDefaults, mergeInfo.fromDefaults) &&
        Objects.equals(this.getter, mergeInfo.getter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromDefaults, getter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeInfo {\n");
    
    sb.append("    fromDefaults: ").append(toIndentedString(fromDefaults)).append("\n");
    sb.append("    getter: ").append(toIndentedString(getter)).append("\n");
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

