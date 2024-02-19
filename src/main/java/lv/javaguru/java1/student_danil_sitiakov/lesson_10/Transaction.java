package lv.javaguru.java1.student_danil_sitiakov.lesson_10;


public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }
    public int getAmount() {
        return amount;
    }
}
