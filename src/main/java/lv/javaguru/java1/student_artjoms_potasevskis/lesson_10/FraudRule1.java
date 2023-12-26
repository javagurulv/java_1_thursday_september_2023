package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;


class FraudRule1 implements FraudRule{

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");
    }


}
