package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

class FraudRule3 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getCity().equals("Sidney")) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }
}
