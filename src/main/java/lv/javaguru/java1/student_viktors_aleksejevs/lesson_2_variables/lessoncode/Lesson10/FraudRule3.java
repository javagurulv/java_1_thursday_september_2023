package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

class FraudRule3 extends FraudRule {
    @Override
    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sidney");

    }

    @Override
    String getName() {
        return "rule3";
    }
}
