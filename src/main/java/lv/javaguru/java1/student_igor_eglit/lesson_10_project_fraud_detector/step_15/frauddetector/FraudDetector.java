package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_15.frauddetector;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5()
    );

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                String ruleName = fraudRule.getRuleName();
                return new FraudDetectionResult(true, ruleName);
            }
        }

        return new FraudDetectionResult(false, null);
    }

}
