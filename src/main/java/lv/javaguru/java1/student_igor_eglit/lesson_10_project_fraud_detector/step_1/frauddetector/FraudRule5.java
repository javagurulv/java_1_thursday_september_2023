package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudRule5 extends FraudRule {
    @Override
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String country = trader.getCountry();
        var amount = transaction.getAmount();
        return country.equals("Germany") && amount > 1000;
    }
    @Override
    String ruleName(){
        return "Rule 5";
    }
}
