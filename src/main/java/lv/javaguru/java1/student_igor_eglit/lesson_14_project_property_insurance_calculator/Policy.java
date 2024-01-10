package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

class Policy {
    private final StringBuilder policyNumber;
    private Status status;
    private Object[] object;

    public Policy(StringBuilder policyNumber, Status status, Object ...object) {
        this.policyNumber = policyNumber;
        this.status = status;
        this.object = object;
    }

    public StringBuilder getPolicyNumber() {
        return policyNumber;
    }

    public Status getStatus() {
        return status;
    }

    public Object[] getObject() {
        return object;
    }
}
