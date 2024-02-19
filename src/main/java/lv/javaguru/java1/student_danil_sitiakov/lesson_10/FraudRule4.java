package lv.javaguru.java1.student_danil_sitiakov.lesson_10;


class FraudRule4 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
    @Override
    public String getRuleName() {
        return "FraudRule4";
    }
}
