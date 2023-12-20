package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;
class FraudRule4 implements FraudRule{
    public boolean isFraud (Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jmaica");
    }
    public String getRuleName() {return "FraudRule4";}
}
