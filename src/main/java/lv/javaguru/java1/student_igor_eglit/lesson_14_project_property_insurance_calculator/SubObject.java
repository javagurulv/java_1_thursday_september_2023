package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class SubObject {
    private String subObjectName;
    private BigDecimal subObjectInsurancePrise;
    private RiskType riskType;

    public SubObject(String subObjectName, BigDecimal subObjectInsurancePrise, RiskType riskType) {
        this.subObjectName = subObjectName;
        this.subObjectInsurancePrise = subObjectInsurancePrise;
        this.riskType = riskType;
    }

    public String getSubObjectName() {
        return subObjectName;
    }

    public BigDecimal getSubObjectInsurancePrise() {
        return subObjectInsurancePrise;
    }

    public RiskType getRiskType() {
        return riskType;
    }

    @Override
    public String toString() {
        return  subObjectName + '\'' +
                "subObjectInsurancePrise= " + subObjectInsurancePrise.setScale(2, RoundingMode.HALF_UP) +
                " riskType= " + riskType;
    }
}
