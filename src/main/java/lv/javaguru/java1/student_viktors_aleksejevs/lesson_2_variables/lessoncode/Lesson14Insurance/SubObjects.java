package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson14Insurance;

import java.math.BigDecimal;

public class SubObjects {
    private String name;
    private BigDecimal sumInsured;
    private RiskType riskType;

    public SubObjects(String name, BigDecimal sumInsured, RiskType riskType) {
        this.name = name;
        this.sumInsured = sumInsured;
        this.riskType = riskType;
    }

    //public SubObjects(String house, List<SubObjects> tv) {
    //}

    public String getName() {
        return name;
    }

    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    public RiskType getRiskType() {
        return riskType;
    }
}
