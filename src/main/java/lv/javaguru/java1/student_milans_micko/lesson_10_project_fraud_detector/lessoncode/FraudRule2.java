package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

class FraudRule2 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "FraudRule2";
    }
}
