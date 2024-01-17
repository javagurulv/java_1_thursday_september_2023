package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SingleSubObjectPremiumCalculatorImpTest {
    SingleSubObjectPremiumCalculatorImp subObject = new SingleSubObjectPremiumCalculatorImp();

    @Test
    void shouldCalculatePremiumForSingleSubObj() {
        assertEquals(new BigDecimal("5.00"),
                subObject.singleSubObjCalculator(SingleSubObjectTestData.example1()));

    }

}