package io.quantixx.sponsor.client.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.quantixx.sponsor.client.activiti.model.JavaType;
import io.quantixx.sponsor.client.activiti.model.JsonDeserializerobject;
import io.quantixx.sponsor.client.activiti.model.ObjectIdGeneratorobject;
import io.quantixx.sponsor.client.activiti.model.ObjectIdResolver;
import io.quantixx.sponsor.client.activiti.model.PropertyName;
import io.quantixx.sponsor.client.activiti.model.SettableBeanProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ObjectIdReader
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-27T10:41:34.309+01:00")

public class ObjectIdReader   {
  @JsonProperty("deserializer")
  private JsonDeserializerobject deserializer = null;

  @JsonProperty("generator")
  private ObjectIdGeneratorobject generator = null;

  @JsonProperty("idProperty")
  private SettableBeanProperty idProperty = null;

  @JsonProperty("idType")
  private JavaType idType = null;

  @JsonProperty("propertyName")
  private PropertyName propertyName = null;

  @JsonProperty("resolver")
  private ObjectIdResolver resolver = null;

  public ObjectIdReader deserializer(JsonDeserializerobject deserializer) {
    this.deserializer = deserializer;
    return this;
  }

   /**
   * Get deserializer
   * @return deserializer
  **/
  @ApiModelProperty(value = "")
  public JsonDeserializerobject getDeserializer() {
    return deserializer;
  }

  public void setDeserializer(JsonDeserializerobject deserializer) {
    this.deserializer = deserializer;
  }

  public ObjectIdReader generator(ObjectIdGeneratorobject generator) {
    this.generator = generator;
    return this;
  }

   /**
   * Get generator
   * @return generator
  **/
  @ApiModelProperty(value = "")
  public ObjectIdGeneratorobject getGenerator() {
    return generator;
  }

  public void setGenerator(ObjectIdGeneratorobject generator) {
    this.generator = generator;
  }

  public ObjectIdReader idProperty(SettableBeanProperty idProperty) {
    this.idProperty = idProperty;
    return this;
  }

   /**
   * Get idProperty
   * @return idProperty
  **/
  @ApiModelProperty(value = "")
  public SettableBeanProperty getIdProperty() {
    return idProperty;
  }

  public void setIdProperty(SettableBeanProperty idProperty) {
    this.idProperty = idProperty;
  }

  public ObjectIdReader idType(JavaType idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @ApiModelProperty(value = "")
  public JavaType getIdType() {
    return idType;
  }

  public void setIdType(JavaType idType) {
    this.idType = idType;
  }

  public ObjectIdReader propertyName(PropertyName propertyName) {
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

  public ObjectIdReader resolver(ObjectIdResolver resolver) {
    this.resolver = resolver;
    return this;
  }

   /**
   * Get resolver
   * @return resolver
  **/
  @ApiModelProperty(value = "")
  public ObjectIdResolver getResolver() {
    return resolver;
  }

  public void setResolver(ObjectIdResolver resolver) {
    this.resolver = resolver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectIdReader objectIdReader = (ObjectIdReader) o;
    return Objects.equals(this.deserializer, objectIdReader.deserializer) &&
        Objects.equals(this.generator, objectIdReader.generator) &&
        Objects.equals(this.idProperty, objectIdReader.idProperty) &&
        Objects.equals(this.idType, objectIdReader.idType) &&
        Objects.equals(this.propertyName, objectIdReader.propertyName) &&
        Objects.equals(this.resolver, objectIdReader.resolver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deserializer, generator, idProperty, idType, propertyName, resolver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectIdReader {\n");
    
    sb.append("    deserializer: ").append(toIndentedString(deserializer)).append("\n");
    sb.append("    generator: ").append(toIndentedString(generator)).append("\n");
    sb.append("    idProperty: ").append(toIndentedString(idProperty)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    resolver: ").append(toIndentedString(resolver)).append("\n");
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

