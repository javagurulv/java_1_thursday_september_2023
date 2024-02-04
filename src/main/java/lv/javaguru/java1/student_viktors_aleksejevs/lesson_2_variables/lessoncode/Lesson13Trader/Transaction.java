package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson13Trader;

public class Transaction {
    private String trader;
    private int year;
    private int value;

    public Transaction(String trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public String getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }
}
