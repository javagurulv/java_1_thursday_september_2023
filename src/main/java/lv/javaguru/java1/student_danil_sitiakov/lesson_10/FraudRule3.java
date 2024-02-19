package lv.javaguru.java1.student_danil_sitiakov.lesson_10;


class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
    @Override
    public String getRuleName() {
        return "FraudRule3";
    }
}
