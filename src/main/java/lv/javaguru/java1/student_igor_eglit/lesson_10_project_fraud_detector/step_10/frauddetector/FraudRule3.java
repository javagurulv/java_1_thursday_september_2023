package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_10.frauddetector;

class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
