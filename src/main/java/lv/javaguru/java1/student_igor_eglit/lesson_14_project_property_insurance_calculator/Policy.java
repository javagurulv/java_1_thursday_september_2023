package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.util.Arrays;

class Policy {
    private final StringBuilder policyNumber;
    private Status status;
    private InsuredObject[] insuredObject;

    public Policy(StringBuilder policyNumber, Status status, InsuredObject... insuredObject) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.insuredObject = insuredObject;
    }

    public StringBuilder getPolicyNumber() {
        return policyNumber;
    }

    public Status getStatus() {
        return status;
    }

    public InsuredObject[] getInsuredObject() {
        return insuredObject;
    }

    @Override
    public String toString() {
        return"policyNumber= " + policyNumber +
                ", status=" + status +
                Arrays.toString(insuredObject);
    }
}
