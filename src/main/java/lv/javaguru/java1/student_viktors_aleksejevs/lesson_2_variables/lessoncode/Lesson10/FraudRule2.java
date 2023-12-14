package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

class FraudRule2 {
    boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;

    }
}
