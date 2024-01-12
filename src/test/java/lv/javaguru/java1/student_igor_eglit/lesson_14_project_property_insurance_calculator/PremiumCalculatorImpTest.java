package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class PremiumCalculatorImpTest {

PremiumCalculatorImp premiumCalculator =new PremiumCalculatorImp();


    @Test
    void shouldCalculatePremiumByAcceptanceCriteriaDefaultCoef() {
        Assertions.assertEquals(new BigDecimal("2.28"), premiumCalculator.calculator(PolicyTestData.example1()));
    }

    @Test
    void shouldCalculatePremiumByAcceptanceCriteriaHighCoef() {
        Assertions.assertEquals(new BigDecimal("17.13"), premiumCalculator.calculator(PolicyTestData.example2()));
    }
}