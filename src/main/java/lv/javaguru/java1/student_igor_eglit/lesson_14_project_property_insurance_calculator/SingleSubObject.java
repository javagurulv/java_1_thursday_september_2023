package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class SingleSubObject {
    private BigDecimal threshold;
    private BigDecimal defaultCoef;
    private BigDecimal highCoef;
    private BigDecimal subObjectInsurancePrise;

    public SingleSubObject(BigDecimal subObjectInsurancePrise,
                           BigDecimal threshold,
                           BigDecimal defaultCoef,
                           BigDecimal highCoef) {
        this.threshold = threshold;
        this.defaultCoef = defaultCoef;
        this.highCoef = highCoef;

        this.subObjectInsurancePrise = subObjectInsurancePrise;

    }

    public BigDecimal getThreshold() {
        return threshold;
    }

    public BigDecimal getDefaultCoef() {
        return defaultCoef;
    }

    public BigDecimal getHighCoef() {
        return highCoef;
    }

    public BigDecimal getSubObjectInsurancePrise() {
        return subObjectInsurancePrise;
    }
}
