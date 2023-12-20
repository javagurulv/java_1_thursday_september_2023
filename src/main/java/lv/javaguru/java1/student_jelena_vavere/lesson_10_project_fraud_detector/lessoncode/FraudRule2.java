package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;

class FraudRule2 implements FraudRule {
    public boolean isFraud (Transaction transaction) {
        return  transaction.getAmount() > 1000000;}
    public String getRuleName() {return "FraudRule2";}
}
