package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;


class InsuredSumCalculation {
    public BigDecimal toSumSubObjectsInsuredPrice(Policy policy, RiskType riskType) {

        return Arrays.stream(policy.getInsuredObject())
                .flatMap(insuredObject -> Arrays.stream(insuredObject.getSubobject()))
                .filter(subObject -> subObject.getRiskType().equals(riskType))
                .map(SubObject::getSubObjectInsurancePrise)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
