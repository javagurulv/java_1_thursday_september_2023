package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudDetectionResult {
    boolean fraud;
    String ruleName;

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud(Transaction transaction) {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }
}
