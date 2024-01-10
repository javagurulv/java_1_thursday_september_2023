package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

class SubObject {
    private String subObjectName;
    private float subObjectInsurancePrise;
    private RiskType riskType;

    public SubObject(String subObjectName, float subObjectInsurancePrise, RiskType riskType) {
        this.subObjectName = subObjectName;
        this.subObjectInsurancePrise = subObjectInsurancePrise;
        this.riskType = riskType;
    }

    public String getSubObjectName() {
        return subObjectName;
    }

    public float getSubObjectInsurancePrise() {
        return subObjectInsurancePrise;
    }

    public RiskType getRiskType() {
        return riskType;
    }
}
