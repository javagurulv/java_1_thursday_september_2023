package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudRule4  extends FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String country = trader.getCountry();
        return country.equals("Jamaica");
    }
    @Override
    public String ruleName(){
        return "Rule 4";
    }
}
