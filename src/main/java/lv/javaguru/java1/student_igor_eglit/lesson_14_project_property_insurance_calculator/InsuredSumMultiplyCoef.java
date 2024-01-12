package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class InsuredSumMultiplyCoef {
    public BigDecimal toApplieCoef(BigDecimal sumInsured, BigDecimal threshold, BigDecimal defaultCoef, BigDecimal highCoef) {
        return sumInsured.compareTo(threshold) <= 0 ? sumInsured.multiply(defaultCoef) : sumInsured.multiply(highCoef);
    }
}
