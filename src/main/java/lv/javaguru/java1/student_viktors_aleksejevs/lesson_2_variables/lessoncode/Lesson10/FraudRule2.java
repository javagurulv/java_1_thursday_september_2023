package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

class FraudRule2 extends FraudRule {
    @Override
    boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;

    }
    @Override
    String getName() {
        return "rule2";
    }
}
