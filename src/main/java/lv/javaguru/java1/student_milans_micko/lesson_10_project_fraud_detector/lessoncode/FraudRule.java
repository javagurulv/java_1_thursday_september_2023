package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

interface FraudRule {

    boolean isFraud(Transaction transaction);
    String getRuleName();
}
