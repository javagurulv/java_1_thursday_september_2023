package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.step_15.frauddetector;

class FraudRule5 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000;
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }

}