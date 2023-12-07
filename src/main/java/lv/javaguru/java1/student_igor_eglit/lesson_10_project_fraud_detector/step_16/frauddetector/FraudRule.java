package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_16.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
