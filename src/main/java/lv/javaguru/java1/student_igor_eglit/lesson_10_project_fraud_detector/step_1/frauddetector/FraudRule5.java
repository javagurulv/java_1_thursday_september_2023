package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudRule5 implements FraudRule {
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String country = trader.getCountry();
        var amount = transaction.getAmount();
        return country.equals("Germany") && amount > 1000;
    }
}
