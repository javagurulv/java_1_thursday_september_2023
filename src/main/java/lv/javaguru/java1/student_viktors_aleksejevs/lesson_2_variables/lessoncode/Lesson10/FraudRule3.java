package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

public class FraudRule3 {
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sidney");

    }
}
