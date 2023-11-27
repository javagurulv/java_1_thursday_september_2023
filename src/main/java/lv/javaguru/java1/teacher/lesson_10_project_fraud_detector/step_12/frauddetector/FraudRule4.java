package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.step_12.frauddetector;

class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
