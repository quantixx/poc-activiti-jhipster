package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.quantixx.sponsor.client.activiti.model.MergeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PropertyMetadata
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class PropertyMetadata   {
  /**
   * Gets or Sets contentNulls
   */
  public enum ContentNullsEnum {
    SET("SET"),
    
    SKIP("SKIP"),
    
    FAIL("FAIL"),
    
    AS_EMPTY("AS_EMPTY"),
    
    DEFAULT("DEFAULT");

    private String value;

    ContentNullsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentNullsEnum fromValue(String text) {
      for (ContentNullsEnum b : ContentNullsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("contentNulls")
  private ContentNullsEnum contentNulls = null;

  @JsonProperty("defaultValue")
  private String defaultValue = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("mergeInfo")
  private MergeInfo mergeInfo = null;

  @JsonProperty("required")
  private Boolean required = null;

  /**
   * Gets or Sets valueNulls
   */
  public enum ValueNullsEnum {
    SET("SET"),
    
    SKIP("SKIP"),
    
    FAIL("FAIL"),
    
    AS_EMPTY("AS_EMPTY"),
    
    DEFAULT("DEFAULT");

    private String value;

    ValueNullsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValueNullsEnum fromValue(String text) {
      for (ValueNullsEnum b : ValueNullsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("valueNulls")
  private ValueNullsEnum valueNulls = null;

  public PropertyMetadata contentNulls(ContentNullsEnum contentNulls) {
    this.contentNulls = contentNulls;
    return this;
  }

   /**
   * Get contentNulls
   * @return contentNulls
  **/
  @ApiModelProperty(value = "")
  public ContentNullsEnum getContentNulls() {
    return contentNulls;
  }

  public void setContentNulls(ContentNullsEnum contentNulls) {
    this.contentNulls = contentNulls;
  }

  public PropertyMetadata defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @ApiModelProperty(value = "")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public PropertyMetadata description(String description) {
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

  public PropertyMetadata index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PropertyMetadata mergeInfo(MergeInfo mergeInfo) {
    this.mergeInfo = mergeInfo;
    return this;
  }

   /**
   * Get mergeInfo
   * @return mergeInfo
  **/
  @ApiModelProperty(value = "")
  public MergeInfo getMergeInfo() {
    return mergeInfo;
  }

  public void setMergeInfo(MergeInfo mergeInfo) {
    this.mergeInfo = mergeInfo;
  }

  public PropertyMetadata required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(value = "")
  public Boolean getRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public PropertyMetadata valueNulls(ValueNullsEnum valueNulls) {
    this.valueNulls = valueNulls;
    return this;
  }

   /**
   * Get valueNulls
   * @return valueNulls
  **/
  @ApiModelProperty(value = "")
  public ValueNullsEnum getValueNulls() {
    return valueNulls;
  }

  public void setValueNulls(ValueNullsEnum valueNulls) {
    this.valueNulls = valueNulls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMetadata propertyMetadata = (PropertyMetadata) o;
    return Objects.equals(this.contentNulls, propertyMetadata.contentNulls) &&
        Objects.equals(this.defaultValue, propertyMetadata.defaultValue) &&
        Objects.equals(this.description, propertyMetadata.description) &&
        Objects.equals(this.index, propertyMetadata.index) &&
        Objects.equals(this.mergeInfo, propertyMetadata.mergeInfo) &&
        Objects.equals(this.required, propertyMetadata.required) &&
        Objects.equals(this.valueNulls, propertyMetadata.valueNulls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentNulls, defaultValue, description, index, mergeInfo, required, valueNulls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMetadata {\n");
    
    sb.append("    contentNulls: ").append(toIndentedString(contentNulls)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    mergeInfo: ").append(toIndentedString(mergeInfo)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    valueNulls: ").append(toIndentedString(valueNulls)).append("\n");
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

