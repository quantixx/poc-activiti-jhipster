package org.activiti.client.sponsor.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Sponsor
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-26T17:30:01.517+01:00")

public class Sponsor   {
  @JsonProperty("additionalInformation")
  private String additionalInformation = null;

  @JsonProperty("businessIdentification")
  private String businessIdentification = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  public Sponsor additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(value = "")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public Sponsor businessIdentification(String businessIdentification) {
    this.businessIdentification = businessIdentification;
    return this;
  }

   /**
   * Get businessIdentification
   * @return businessIdentification
  **/
  @ApiModelProperty(value = "")
  public String getBusinessIdentification() {
    return businessIdentification;
  }

  public void setBusinessIdentification(String businessIdentification) {
    this.businessIdentification = businessIdentification;
  }

  public Sponsor companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Sponsor id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Sponsor phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sponsor sponsor = (Sponsor) o;
    return Objects.equals(this.additionalInformation, sponsor.additionalInformation) &&
        Objects.equals(this.businessIdentification, sponsor.businessIdentification) &&
        Objects.equals(this.companyName, sponsor.companyName) &&
        Objects.equals(this.id, sponsor.id) &&
        Objects.equals(this.phoneNumber, sponsor.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, businessIdentification, companyName, id, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sponsor {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    businessIdentification: ").append(toIndentedString(businessIdentification)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

