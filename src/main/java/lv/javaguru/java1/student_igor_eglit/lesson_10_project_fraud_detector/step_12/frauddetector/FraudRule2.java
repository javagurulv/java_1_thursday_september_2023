package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_12.frauddetector;

class FraudRule2 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
