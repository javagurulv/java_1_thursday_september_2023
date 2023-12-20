package lv.javaguru.java1.student_sergejs_roslakovs.lesson_10_project_fraud_detector;

class FraudRule2 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
