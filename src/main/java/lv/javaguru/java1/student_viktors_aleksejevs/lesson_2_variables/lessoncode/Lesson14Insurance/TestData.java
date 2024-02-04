package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson14Insurance;

import java.math.BigDecimal;
import java.util.List;

public class TestData {

    public static void main(String[] args) {
        var tv = new SubObjects("tv", new BigDecimal("100.00"), RiskType.FIRE);
        var notebook = new SubObjects("notebook", new BigDecimal("8.00"), RiskType.THEFT);

        var house = new InsuredObjects("house", List.of(tv, notebook));

        var policy = new Policy("12345", PolicyStatus.APPROVED, List.of(house));

    }


    private static Policy example1() {
        var tv = new SubObjects("tv", new BigDecimal("100.00"), RiskType.FIRE);
        var notebook = new SubObjects("notebook", new BigDecimal("8.00"), RiskType.THEFT);
        var house = new InsuredObjects("house", List.of(tv, notebook));
        return new  Policy("12345", PolicyStatus.APPROVED, List.of(house));


    }

    private static Policy example2() {
        var tv1 = new SubObjects("tv", new BigDecimal("100.00"), RiskType.FIRE);
        var notebook = new SubObjects("notebook", new BigDecimal("8.00"), RiskType.THEFT);

        var tv2 = new SubObjects("tv2",new BigDecimal("100"), RiskType.THEFT);
        var mobile = new SubObjects("mobile", new BigDecimal("7"), RiskType.THEFT);
        var bicycle = new SubObjects("bicycle", new BigDecimal("9"), RiskType.THEFT);

        var house = new InsuredObjects("house", List.of(tv1,tv2, notebook));
        var flat = new InsuredObjects("house", List.of(mobile, bicycle));

        return new Policy("12345", PolicyStatus.APPROVED, List.of(house,flat));
    }


}
