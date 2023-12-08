package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;
class FraudRule1 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        //String traderName = trader.getFullName();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}
