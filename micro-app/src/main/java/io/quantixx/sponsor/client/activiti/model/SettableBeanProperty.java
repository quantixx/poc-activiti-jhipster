package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.AnnotatedMember;
import io.quantixx.sponsor.client.activiti.model.JavaType;
import io.quantixx.sponsor.client.activiti.model.JsonDeserializerobject;
import io.quantixx.sponsor.client.activiti.model.NullValueProvider;
import io.quantixx.sponsor.client.activiti.model.ObjectIdInfo;
import io.quantixx.sponsor.client.activiti.model.PropertyMetadata;
import io.quantixx.sponsor.client.activiti.model.PropertyName;
import io.quantixx.sponsor.client.activiti.model.TypeDeserializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SettableBeanProperty
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class SettableBeanProperty   {
  @JsonProperty("creatorIndex")
  private Integer creatorIndex = null;

  @JsonProperty("fullName")
  private PropertyName fullName = null;

  @JsonProperty("injectableValueId")
  private Object injectableValueId = null;

  @JsonProperty("managedReferenceName")
  private String managedReferenceName = null;

  @JsonProperty("member")
  private AnnotatedMember member = null;

  @JsonProperty("metadata")
  private PropertyMetadata metadata = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nullValueProvider")
  private NullValueProvider nullValueProvider = null;

  @JsonProperty("objectIdInfo")
  private ObjectIdInfo objectIdInfo = null;

  @JsonProperty("propertyIndex")
  private Integer propertyIndex = null;

  @JsonProperty("required")
  private Boolean required = null;

  @JsonProperty("type")
  private JavaType type = null;

  @JsonProperty("valueDeserializer")
  private JsonDeserializerobject valueDeserializer = null;

  @JsonProperty("valueTypeDeserializer")
  private TypeDeserializer valueTypeDeserializer = null;

  @JsonProperty("virtual")
  private Boolean virtual = null;

  @JsonProperty("wrapperName")
  private PropertyName wrapperName = null;

  public SettableBeanProperty creatorIndex(Integer creatorIndex) {
    this.creatorIndex = creatorIndex;
    return this;
  }

   /**
   * Get creatorIndex
   * @return creatorIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatorIndex() {
    return creatorIndex;
  }

  public void setCreatorIndex(Integer creatorIndex) {
    this.creatorIndex = creatorIndex;
  }

  public SettableBeanProperty fullName(PropertyName fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(value = "")
  public PropertyName getFullName() {
    return fullName;
  }

  public void setFullName(PropertyName fullName) {
    this.fullName = fullName;
  }

  public SettableBeanProperty injectableValueId(Object injectableValueId) {
    this.injectableValueId = injectableValueId;
    return this;
  }

   /**
   * Get injectableValueId
   * @return injectableValueId
  **/
  @ApiModelProperty(value = "")
  public Object getInjectableValueId() {
    return injectableValueId;
  }

  public void setInjectableValueId(Object injectableValueId) {
    this.injectableValueId = injectableValueId;
  }

  public SettableBeanProperty managedReferenceName(String managedReferenceName) {
    this.managedReferenceName = managedReferenceName;
    return this;
  }

   /**
   * Get managedReferenceName
   * @return managedReferenceName
  **/
  @ApiModelProperty(value = "")
  public String getManagedReferenceName() {
    return managedReferenceName;
  }

  public void setManagedReferenceName(String managedReferenceName) {
    this.managedReferenceName = managedReferenceName;
  }

  public SettableBeanProperty member(AnnotatedMember member) {
    this.member = member;
    return this;
  }

   /**
   * Get member
   * @return member
  **/
  @ApiModelProperty(value = "")
  public AnnotatedMember getMember() {
    return member;
  }

  public void setMember(AnnotatedMember member) {
    this.member = member;
  }

  public SettableBeanProperty metadata(PropertyMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public PropertyMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(PropertyMetadata metadata) {
    this.metadata = metadata;
  }

  public SettableBeanProperty name(String name) {
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

  public SettableBeanProperty nullValueProvider(NullValueProvider nullValueProvider) {
    this.nullValueProvider = nullValueProvider;
    return this;
  }

   /**
   * Get nullValueProvider
   * @return nullValueProvider
  **/
  @ApiModelProperty(value = "")
  public NullValueProvider getNullValueProvider() {
    return nullValueProvider;
  }

  public void setNullValueProvider(NullValueProvider nullValueProvider) {
    this.nullValueProvider = nullValueProvider;
  }

  public SettableBeanProperty objectIdInfo(ObjectIdInfo objectIdInfo) {
    this.objectIdInfo = objectIdInfo;
    return this;
  }

   /**
   * Get objectIdInfo
   * @return objectIdInfo
  **/
  @ApiModelProperty(value = "")
  public ObjectIdInfo getObjectIdInfo() {
    return objectIdInfo;
  }

  public void setObjectIdInfo(ObjectIdInfo objectIdInfo) {
    this.objectIdInfo = objectIdInfo;
  }

  public SettableBeanProperty propertyIndex(Integer propertyIndex) {
    this.propertyIndex = propertyIndex;
    return this;
  }

   /**
   * Get propertyIndex
   * @return propertyIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getPropertyIndex() {
    return propertyIndex;
  }

  public void setPropertyIndex(Integer propertyIndex) {
    this.propertyIndex = propertyIndex;
  }

  public SettableBeanProperty required(Boolean required) {
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

  public SettableBeanProperty type(JavaType type) {
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

  public SettableBeanProperty valueDeserializer(JsonDeserializerobject valueDeserializer) {
    this.valueDeserializer = valueDeserializer;
    return this;
  }

   /**
   * Get valueDeserializer
   * @return valueDeserializer
  **/
  @ApiModelProperty(value = "")
  public JsonDeserializerobject getValueDeserializer() {
    return valueDeserializer;
  }

  public void setValueDeserializer(JsonDeserializerobject valueDeserializer) {
    this.valueDeserializer = valueDeserializer;
  }

  public SettableBeanProperty valueTypeDeserializer(TypeDeserializer valueTypeDeserializer) {
    this.valueTypeDeserializer = valueTypeDeserializer;
    return this;
  }

   /**
   * Get valueTypeDeserializer
   * @return valueTypeDeserializer
  **/
  @ApiModelProperty(value = "")
  public TypeDeserializer getValueTypeDeserializer() {
    return valueTypeDeserializer;
  }

  public void setValueTypeDeserializer(TypeDeserializer valueTypeDeserializer) {
    this.valueTypeDeserializer = valueTypeDeserializer;
  }

  public SettableBeanProperty virtual(Boolean virtual) {
    this.virtual = virtual;
    return this;
  }

   /**
   * Get virtual
   * @return virtual
  **/
  @ApiModelProperty(value = "")
  public Boolean getVirtual() {
    return virtual;
  }

  public void setVirtual(Boolean virtual) {
    this.virtual = virtual;
  }

  public SettableBeanProperty wrapperName(PropertyName wrapperName) {
    this.wrapperName = wrapperName;
    return this;
  }

   /**
   * Get wrapperName
   * @return wrapperName
  **/
  @ApiModelProperty(value = "")
  public PropertyName getWrapperName() {
    return wrapperName;
  }

  public void setWrapperName(PropertyName wrapperName) {
    this.wrapperName = wrapperName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettableBeanProperty settableBeanProperty = (SettableBeanProperty) o;
    return Objects.equals(this.creatorIndex, settableBeanProperty.creatorIndex) &&
        Objects.equals(this.fullName, settableBeanProperty.fullName) &&
        Objects.equals(this.injectableValueId, settableBeanProperty.injectableValueId) &&
        Objects.equals(this.managedReferenceName, settableBeanProperty.managedReferenceName) &&
        Objects.equals(this.member, settableBeanProperty.member) &&
        Objects.equals(this.metadata, settableBeanProperty.metadata) &&
        Objects.equals(this.name, settableBeanProperty.name) &&
        Objects.equals(this.nullValueProvider, settableBeanProperty.nullValueProvider) &&
        Objects.equals(this.objectIdInfo, settableBeanProperty.objectIdInfo) &&
        Objects.equals(this.propertyIndex, settableBeanProperty.propertyIndex) &&
        Objects.equals(this.required, settableBeanProperty.required) &&
        Objects.equals(this.type, settableBeanProperty.type) &&
        Objects.equals(this.valueDeserializer, settableBeanProperty.valueDeserializer) &&
        Objects.equals(this.valueTypeDeserializer, settableBeanProperty.valueTypeDeserializer) &&
        Objects.equals(this.virtual, settableBeanProperty.virtual) &&
        Objects.equals(this.wrapperName, settableBeanProperty.wrapperName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorIndex, fullName, injectableValueId, managedReferenceName, member, metadata, name, nullValueProvider, objectIdInfo, propertyIndex, required, type, valueDeserializer, valueTypeDeserializer, virtual, wrapperName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettableBeanProperty {\n");
    
    sb.append("    creatorIndex: ").append(toIndentedString(creatorIndex)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    injectableValueId: ").append(toIndentedString(injectableValueId)).append("\n");
    sb.append("    managedReferenceName: ").append(toIndentedString(managedReferenceName)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nullValueProvider: ").append(toIndentedString(nullValueProvider)).append("\n");
    sb.append("    objectIdInfo: ").append(toIndentedString(objectIdInfo)).append("\n");
    sb.append("    propertyIndex: ").append(toIndentedString(propertyIndex)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueDeserializer: ").append(toIndentedString(valueDeserializer)).append("\n");
    sb.append("    valueTypeDeserializer: ").append(toIndentedString(valueTypeDeserializer)).append("\n");
    sb.append("    virtual: ").append(toIndentedString(virtual)).append("\n");
    sb.append("    wrapperName: ").append(toIndentedString(wrapperName)).append("\n");
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

