package com.test.dependency.controller;

import com.test.dependency.repository.ValidationRepository;
import com.test.dependency.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ValidationController {

    @Autowired
    ValidationService validationService;

    @GetMapping("/validateMinimumSumAssured")
    public ResponseEntity<Boolean> validateMinimumSumAssured(@RequestParam int sumAssured){
        return new ResponseEntity<>(validationService.validateMinimumSumAssured(sumAssured), HttpStatus.OK);
    }

    @GetMapping("/validateMaximumSumAssured")
    public ResponseEntity<Boolean> validateMaximumSumAssured(@RequestParam int sumAssured){
        return new ResponseEntity<>(validationService.validateMaximumSumAssured(sumAssured), HttpStatus.OK);
    }

    @GetMapping("/validateMinimumAgeLimits")
    public ResponseEntity<Boolean> validateMinimumAgeLimits(@RequestParam int age){
        return new ResponseEntity<>(validationService.validateMinimumAgeLimits(age), HttpStatus.OK);
    }

    @GetMapping("/validateMaximumAgeLimits")
    public ResponseEntity<Boolean> validateMaximumAgeLimits(@RequestParam int age){
        return new ResponseEntity<>(validationService.validateMaximumAgeLimits(age), HttpStatus.OK);
    }

    @GetMapping("/validateAnnualIncome")
    public ResponseEntity<Boolean> validateAnnualIncome(@RequestParam int income){
        return new ResponseEntity<>(validationService.validateAnnualIncome(income), HttpStatus.OK);
    }

    @GetMapping("/getSumAssuredRanges")
    public ResponseEntity<List<Integer>> getSumAssuredRanges(){
        return new ResponseEntity<>(validationService.getSumAssuredRanges(), HttpStatus.OK);
    }

    @GetMapping("/getPolicyTenureRanges")
    public ResponseEntity<List<Integer>> getPolicyTenureRanges(){
        return new ResponseEntity<>(validationService.getPolicyTenureRanges(), HttpStatus.OK);
    }

    @GetMapping("/validateOTPAuthentication")
    public ResponseEntity<Boolean> validateOTPAuthentication(@RequestParam String otp){
        return new ResponseEntity<>(validationService.validateOTPAuthentication(otp), HttpStatus.OK);
    }

    @GetMapping("/validateSpouseEligibility")
    public ResponseEntity<Boolean> validateSpouseEligibility(@RequestParam boolean eligible){
        return new ResponseEntity<>(validationService.validateSpouseEligibility(eligible), HttpStatus.OK);
    }

}