package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.step_16.frauddetector;

class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }

}
