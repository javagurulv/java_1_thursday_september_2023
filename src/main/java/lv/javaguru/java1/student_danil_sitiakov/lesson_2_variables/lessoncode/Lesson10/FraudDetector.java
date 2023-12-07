package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson10;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }
}