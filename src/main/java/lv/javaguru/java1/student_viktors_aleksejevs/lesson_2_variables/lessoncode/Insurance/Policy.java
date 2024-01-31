package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Insurance;

import lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_9.insurance.InsuredObject;
import lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_9.insurance.PolicyStatus;

import java.util.List;

public class Policy {
    private String policyNumber;
    private PolicyStatus status;
    private List<InsuredObject> insuredObjectList;

    public Policy(String policyNumber, PolicyStatus status, List<InsuredObject> insuredObjectList) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.insuredObjectList = insuredObjectList;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<InsuredObject> getInsuredObjectList() {
        return insuredObjectList;
    }
}
