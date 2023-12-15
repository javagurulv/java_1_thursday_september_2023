package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;


abstract class FraudRule {
    abstract boolean isFraud(Transaction transaction);

    abstract String ruleName();
}




