package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.step_14.frauddetector;

class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
