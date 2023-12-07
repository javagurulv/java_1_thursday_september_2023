package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_5.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (transaction.getAmount() > 1000000) {
            return true;
        }

        return false;
    }

}
