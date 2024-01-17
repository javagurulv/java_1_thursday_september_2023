package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.solution;

import java.math.BigDecimal;
import java.util.List;

class TestData {

    public static void main(String[] args) {
        var policy1 = example1();
        var policy2 = example2();
    }

    private static Policy example1() {
        var tv = new SubObject("tv", new BigDecimal("100.00"), RiskType.FIRE);
        var notebook = new SubObject("notebook", new BigDecimal("8.00"), RiskType.THEFT);

        var house = new InsuranceObject("house", List.of(tv, notebook));

        return new Policy("1234", PolicyStatus.APPROVED, List.of(house));
    }

    private static Policy example2() {
        var tv1 = new SubObject("tv", new BigDecimal("100.00"), RiskType.FIRE);
        var notebook = new SubObject("notebook", new BigDecimal("8.00"), RiskType.THEFT);
        var tv2 = new SubObject("tv", new BigDecimal("100.00"), RiskType.THEFT);

        var house = new InsuranceObject("house", List.of(tv1, tv2, notebook));

        var mobile = new SubObject("mobile", new BigDecimal("7.00"), RiskType.FIRE);
        var bicycle = new SubObject("bicycle", new BigDecimal("9.00"), RiskType.THEFT);

        var flat = new InsuranceObject("house", List.of(mobile, bicycle));

        return new Policy("1234", PolicyStatus.APPROVED, List.of(house, flat));
    }

}
