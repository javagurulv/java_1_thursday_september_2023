package lv.javaguru.java1.student_jelena_vavere.lesson_14project_property_insurance_calculator;

import java.math.BigDecimal;

public class SubObject {
    private String name;
    private BigDecimal sumInsured;
    private RiskType riskType;

    public SubObject(String name, BigDecimal sumInsured, RiskType riskType) {
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
