package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.solution;

import java.math.BigDecimal;

class SubObject {

    private String name;
    private BigDecimal sumInsured;
    private RiskType riskType;

    public SubObject(String name,
                     BigDecimal sumInsured,
                     RiskType riskType) {
        this.name = name;
        this.sumInsured = sumInsured;
        this.riskType = riskType;
    }

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
