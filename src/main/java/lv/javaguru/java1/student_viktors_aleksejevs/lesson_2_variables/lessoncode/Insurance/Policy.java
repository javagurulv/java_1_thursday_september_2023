package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Insurance;

import java.util.List;

public class Policy {
    private String policyNumber;
    private lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Insurance.PolicyStatus status;
    private List<InsuredObjects> insuredObjectList;

    public Policy(String policyNumber, lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Insurance.PolicyStatus status, List<InsuredObjects> insuredObjectList) {
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

    public List<InsuredObjects> getInsuredObjectList() {
        return insuredObjectList;
    }
}
