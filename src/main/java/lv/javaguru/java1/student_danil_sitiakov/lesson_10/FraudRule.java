package lv.javaguru.java1.student_danil_sitiakov.lesson_10;


public interface FraudRule {
        boolean isFraud(Transaction transaction);

    String getRuleName();
}
