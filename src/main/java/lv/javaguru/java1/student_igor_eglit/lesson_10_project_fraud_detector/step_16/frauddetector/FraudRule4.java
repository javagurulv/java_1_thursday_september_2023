package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_16.frauddetector;

class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "FraudRule4";
    }

}
