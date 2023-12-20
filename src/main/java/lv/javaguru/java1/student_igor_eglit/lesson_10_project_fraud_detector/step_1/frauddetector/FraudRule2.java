package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudRule2 extends FraudRule {
   @Override
    public boolean isFraud(Transaction transaction) {
        var amount = transaction.getAmount();
        return amount > 1000000;
    }
    @Override
    public String ruleName(){
       return "Rule 2";
    }
}
