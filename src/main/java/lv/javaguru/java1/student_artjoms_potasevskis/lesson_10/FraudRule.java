package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;


public interface FraudRule {
        boolean isFraud(Transaction transaction);

    String getRuleName();
}
