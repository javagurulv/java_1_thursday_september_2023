package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PremiumCalculatorTest {
PolicyTestData policyTestData=  new PolicyTestData();
PremiumCalculator premiumCalculator=new PremiumCalculator();
   @Test
    void shouldCalculatePremiumByAcceptanceCriteriaDefaultCoef(){
      //assertEquals(new BigDecimal("2.28"),premiumCalculator.calculate(policyTestData.testPolicy_1));
    }

    @Test
    void shouldCalculatePremiumByAcceptanceCriteriaHighCoef(){
      // assertEquals(new BigDecimal("17.13"),premiumCalculator.calculate(policyTestData.testPolicy_2));
    }
}