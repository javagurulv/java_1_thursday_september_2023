package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

class Transaction {

    private Trader trader;
    private int year;
    private int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " + '\t' +
                "year: "+this.year+", " + '\t' +
                "value:" + this.value +"}" +'\t';
    }

}
