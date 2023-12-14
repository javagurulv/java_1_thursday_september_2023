package lv.javaguru.java1.student_sergejs_roslakovs.lesson_10_project_fraud_detector;

class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
