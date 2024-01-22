package lv.javaguru.java1.student_artjoms_potasevskis.lesson_14;

import java.util.List;

public class Policy {

private String policyNumber;
private PolicyStatus status;

private List<InsuranceObject> insuranceObjects;


    public Policy(String policyNumber, PolicyStatus status, List<InsuranceObject> insuranceObjects) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.insuranceObjects = insuranceObjects;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public PolicyStatus getStatus() {
        return status;
    }

    public List<InsuranceObject> getInsuranceObjects() {
        return insuranceObjects;
    }
}
