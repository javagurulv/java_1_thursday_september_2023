package lv.javaguru.java1.student_sergejs_roslakovs.lesson_13_project_traders_and_transactions;

class Transaction {

    private Trader trader;
    private int iYear;
    private int iValue;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.iYear = year;
        this.iValue = value;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.iYear;
    }

    public int getValue() {
        return this.iValue;
    }

    public String toString() {
        return "{" + this.trader.toString() + ", year: " + this.iYear + ", value: " + this.iValue + "}";
    }

}