package com.everis.rest.service.vo;

import java.io.Serializable;

public class WageVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date;
    private String periodicity;
    private Long grossTaxable;
    private Long grossPayExempt;
    private Long legalDiscounts;
    private Long otherDiscounts;
    private Long netSalary;
    private Double workedDays;
    private Double licencedDays;
    private String pdfUrl;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public Long getGrossTaxable() {
        return grossTaxable;
    }

    public void setGrossTaxable(Long grossTaxable) {
        this.grossTaxable = grossTaxable;
    }

    public Long getGrossPayExempt() {
        return grossPayExempt;
    }

    public void setGrossPayExempt(Long grossPayExempt) {
        this.grossPayExempt = grossPayExempt;
    }

    public Long getLegalDiscounts() {
        return legalDiscounts;
    }

    public void setLegalDiscounts(Long legalDiscounts) {
        this.legalDiscounts = legalDiscounts;
    }

    public Long getOtherDiscounts() {
        return otherDiscounts;
    }

    public void setOtherDiscounts(Long otherDiscounts) {
        this.otherDiscounts = otherDiscounts;
    }

    public Long getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(Long netSalary) {
        this.netSalary = netSalary;
    }

    public Double getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(Double workedDays) {
        this.workedDays = workedDays;
    }

    public Double getLicencedDays() {
        return licencedDays;
    }

    public void setLicencedDays(Double licencedDays) {
        this.licencedDays = licencedDays;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

}
