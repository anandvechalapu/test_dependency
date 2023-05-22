package com.test.dependency.service;

import com.test.dependency.repository.ValidationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationService {

    private final ValidationRepository validationRepository;

    public ValidationService(ValidationRepository validationRepository) {
        this.validationRepository = validationRepository;
    }

    public boolean validateMinimumSumAssured(int sumAssured) {
        return validationRepository.validateMinimumSumAssured(sumAssured);
    }

    public boolean validateMaximumSumAssured(int sumAssured) {
        return validationRepository.validateMaximumSumAssured(sumAssured);
    }

    public boolean validateMinimumAgeLimits(int age) {
        return validationRepository.validateMinimumAgeLimits(age);
    }

    public boolean validateMaximumAgeLimits(int age) {
        return validationRepository.validateMaximumAgeLimits(age);
    }

    public boolean validateAnnualIncome(int income) {
        return validationRepository.validateAnnualIncome(income);
    }

    public List<Integer> getSumAssuredRanges() {
        return validationRepository.getSumAssuredRanges();
    }

    public List<Integer> getPolicyTenureRanges() {
        return validationRepository.getPolicyTenureRanges();
    }

    public boolean validateOTPAuthentication(String otp) {
        return validationRepository.validateOTPAuthentication(otp);
    }

    public boolean validateSpouseEligibility(boolean eligible) {
        return validationRepository.validateSpouseEligibility(eligible);
    }
}