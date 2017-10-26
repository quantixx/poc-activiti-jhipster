package io.quantixx.sponsor.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Invoice.
 */
@Entity
@Table(name = "invoice")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber;

    @Column(name = "sponsor_name")
    private String sponsorName;

    @Column(name = "limit_payment_date")
    private LocalDate limitPaymentDate;

    @Column(name = "sub_total")
    private Float subTotal;

    @Column(name = "vat_rate")
    private Float vatRate;

    @Column(name = "vat")
    private Float vat;

    @Column(name = "total")
    private Float total;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public Invoice invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public Invoice sponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
        return this;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public LocalDate getLimitPaymentDate() {
        return limitPaymentDate;
    }

    public Invoice limitPaymentDate(LocalDate limitPaymentDate) {
        this.limitPaymentDate = limitPaymentDate;
        return this;
    }

    public void setLimitPaymentDate(LocalDate limitPaymentDate) {
        this.limitPaymentDate = limitPaymentDate;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public Invoice subTotal(Float subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public Float getVatRate() {
        return vatRate;
    }

    public Invoice vatRate(Float vatRate) {
        this.vatRate = vatRate;
        return this;
    }

    public void setVatRate(Float vatRate) {
        this.vatRate = vatRate;
    }

    public Float getVat() {
        return vat;
    }

    public Invoice vat(Float vat) {
        this.vat = vat;
        return this;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    public Float getTotal() {
        return total;
    }

    public Invoice total(Float total) {
        this.total = total;
        return this;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Invoice invoice = (Invoice) o;
        if (invoice.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), invoice.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Invoice{" +
            "id=" + getId() +
            ", invoiceNumber='" + getInvoiceNumber() + "'" +
            ", sponsorName='" + getSponsorName() + "'" +
            ", limitPaymentDate='" + getLimitPaymentDate() + "'" +
            ", subTotal='" + getSubTotal() + "'" +
            ", vatRate='" + getVatRate() + "'" +
            ", vat='" + getVat() + "'" +
            ", total='" + getTotal() + "'" +
            "}";
    }
}
