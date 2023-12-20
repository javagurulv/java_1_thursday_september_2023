package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudRule3 extends FraudRule {
  @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String city = trader.getCity();
        return city.equals("Sydney");
    }
    @Override
    public String ruleName(){
      return "Rule 3";
    }
}
