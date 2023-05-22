package com.test.dependency.model;

import java.util.List;

public class ValidationModel {

    private boolean validateMinimumSumAssured;
    private boolean validateMaximumSumAssured;
    private boolean validateMinimumAgeLimits;
    private boolean validateMaximumAgeLimits;
    private boolean validateAnnualIncome;
    private List<Integer> sumAssuredRanges;
    private List<Integer> policyTenureRanges;
    private boolean validateOTPAuthentication;
    private boolean validateSpouseEligibility;

    public ValidationModel() {
    }

    public boolean isValidateMinimumSumAssured() {
        return validateMinimumSumAssured;
    }

    public void setValidateMinimumSumAssured(boolean validateMinimumSumAssured) {
        this.validateMinimumSumAssured = validateMinimumSumAssured;
    }

    public boolean isValidateMaximumSumAssured() {
        return validateMaximumSumAssured;
    }

    public void setValidateMaximumSumAssured(boolean validateMaximumSumAssured) {
        this.validateMaximumSumAssured = validateMaximumSumAssured;
    }

    public boolean isValidateMinimumAgeLimits() {
        return validateMinimumAgeLimits;
    }

    public void setValidateMinimumAgeLimits(boolean validateMinimumAgeLimits) {
        this.validateMinimumAgeLimits = validateMinimumAgeLimits;
    }

    public boolean isValidateMaximumAgeLimits() {
        return validateMaximumAgeLimits;
    }

    public void setValidateMaximumAgeLimits(boolean validateMaximumAgeLimits) {
        this.validateMaximumAgeLimits = validateMaximumAgeLimits;
    }

    public boolean isValidateAnnualIncome() {
        return validateAnnualIncome;
    }

    public void setValidateAnnualIncome(boolean validateAnnualIncome) {
        this.validateAnnualIncome = validateAnnualIncome;
    }

    public List<Integer> getSumAssuredRanges() {
        return sumAssuredRanges;
    }

    public void setSumAssuredRanges(List<Integer> sumAssuredRanges) {
        this.sumAssuredRanges = sumAssuredRanges;
    }

    public List<Integer> getPolicyTenureRanges() {
        return policyTenureRanges;
    }

    public void setPolicyTenureRanges(List<Integer> policyTenureRanges) {
        this.policyTenureRanges = policyTenureRanges;
    }

    public boolean isValidateOTPAuthentication() {
        return validateOTPAuthentication;
    }

    public void setValidateOTPAuthentication(boolean validateOTPAuthentication) {
        this.validateOTPAuthentication = validateOTPAuthentication;
    }

    public boolean isValidateSpouseEligibility() {
        return validateSpouseEligibility;
    }

    public void setValidateSpouseEligibility(boolean validateSpouseEligibility) {
        this.validateSpouseEligibility = validateSpouseEligibility;
    }
}