package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class Premium_FIRE{


    public BigDecimal calculate(Policy policy) {

        List<InsuredObject> insuredObjects = Arrays.asList(policy.getInsuredObject());
        List<SubObject> subObjects = insuredObjects.stream()
                .flatMap(insuredObject -> Arrays.stream(insuredObject.getSubobject()))
                .toList();

        var sum =  subObjects.stream()
                .filter(subObject -> subObject.getRiskType().equals(RiskType.FIRE))
                .map(SubObject::getSubObjectInsurancePrise)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return sum.compareTo(BigDecimal.valueOf(100))<=0 ? sum.multiply(BigDecimal.valueOf(0.014)) : sum.multiply(BigDecimal.valueOf(0.024));
    }
}