package org.activiti.client.sponsor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Invoice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-26T17:30:01.517+01:00")

public class Invoice   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("invoiceNumber")
  private String invoiceNumber = null;

  @JsonProperty("limitPaymentDate")
  private LocalDate limitPaymentDate = null;

  @JsonProperty("sponsorName")
  private String sponsorName = null;

  @JsonProperty("subTotal")
  private Float subTotal = null;

  @JsonProperty("total")
  private Float total = null;

  @JsonProperty("vat")
  private Float vat = null;

  @JsonProperty("vatRate")
  private Float vatRate = null;

  public Invoice id(Long id) {
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

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice limitPaymentDate(LocalDate limitPaymentDate) {
    this.limitPaymentDate = limitPaymentDate;
    return this;
  }

   /**
   * Get limitPaymentDate
   * @return limitPaymentDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getLimitPaymentDate() {
    return limitPaymentDate;
  }

  public void setLimitPaymentDate(LocalDate limitPaymentDate) {
    this.limitPaymentDate = limitPaymentDate;
  }

  public Invoice sponsorName(String sponsorName) {
    this.sponsorName = sponsorName;
    return this;
  }

   /**
   * Get sponsorName
   * @return sponsorName
  **/
  @ApiModelProperty(value = "")
  public String getSponsorName() {
    return sponsorName;
  }

  public void setSponsorName(String sponsorName) {
    this.sponsorName = sponsorName;
  }

  public Invoice subTotal(Float subTotal) {
    this.subTotal = subTotal;
    return this;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")
  public Float getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(Float subTotal) {
    this.subTotal = subTotal;
  }

  public Invoice total(Float total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Float getTotal() {
    return total;
  }

  public void setTotal(Float total) {
    this.total = total;
  }

  public Invoice vat(Float vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @ApiModelProperty(value = "")
  public Float getVat() {
    return vat;
  }

  public void setVat(Float vat) {
    this.vat = vat;
  }

  public Invoice vatRate(Float vatRate) {
    this.vatRate = vatRate;
    return this;
  }

   /**
   * Get vatRate
   * @return vatRate
  **/
  @ApiModelProperty(value = "")
  public Float getVatRate() {
    return vatRate;
  }

  public void setVatRate(Float vatRate) {
    this.vatRate = vatRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.limitPaymentDate, invoice.limitPaymentDate) &&
        Objects.equals(this.sponsorName, invoice.sponsorName) &&
        Objects.equals(this.subTotal, invoice.subTotal) &&
        Objects.equals(this.total, invoice.total) &&
        Objects.equals(this.vat, invoice.vat) &&
        Objects.equals(this.vatRate, invoice.vatRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, invoiceNumber, limitPaymentDate, sponsorName, subTotal, total, vat, vatRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    limitPaymentDate: ").append(toIndentedString(limitPaymentDate)).append("\n");
    sb.append("    sponsorName: ").append(toIndentedString(sponsorName)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    vatRate: ").append(toIndentedString(vatRate)).append("\n");
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

