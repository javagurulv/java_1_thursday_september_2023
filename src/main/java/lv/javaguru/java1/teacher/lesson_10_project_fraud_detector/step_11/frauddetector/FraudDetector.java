package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.step_11.frauddetector;

class FraudDetector {

    private FraudRule rule1 = new FraudRule1();
    private FraudRule rule2 = new FraudRule2();
    private FraudRule rule3 = new FraudRule3();
    private FraudRule rule4 = new FraudRule4();
    private FraudRule rule5 = new FraudRule5();

    boolean isFraud(Transaction transaction) {
        return rule1.isFraud(transaction)
                || rule2.isFraud(transaction)
                || rule3.isFraud(transaction)
                || rule4.isFraud(transaction)
                || rule5.isFraud(transaction);
    }

}
