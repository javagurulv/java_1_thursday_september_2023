package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class Premium_FIRE{

    //@Override
    public BigDecimal calculate(Policy policy) {

        List<InsuredObject> insuredObjects = Arrays.asList(policy.getInsuredObject());
        List<SubObject> subObjects = insuredObjects.stream()
                .flatMap(insuredObject -> Arrays.stream(insuredObject.getSubobject()))
                .toList();

        return subObjects.stream()
                .filter(subObject -> subObject.getRiskType().equals(RiskType.FIRE))
                .map(SubObject::getSubObjectInsurancePrise)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}