@Repository
public interface ValidationRepository {
 
    boolean validateMinimumSumAssured(int sumAssured);
 
    boolean validateMaximumSumAssured(int sumAssured);
 
    boolean validateMinimumAgeLimits(int age);
 
    boolean validateMaximumAgeLimits(int age);
 
    boolean validateAnnualIncome(int income);
 
    List<Integer> getSumAssuredRanges();
 
    List<Integer> getPolicyTenureRanges();
 
    boolean validateOTPAuthentication(String otp);
 
    boolean validateSpouseEligibility(boolean eligible);
 
}