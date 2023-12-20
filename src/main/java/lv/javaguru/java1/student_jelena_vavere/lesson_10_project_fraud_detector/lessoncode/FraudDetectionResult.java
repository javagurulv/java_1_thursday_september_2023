package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;

public class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;


    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }
    public boolean isFraud() {return fraud;}
        public String getRuleName () {return ruleName;}
    }
