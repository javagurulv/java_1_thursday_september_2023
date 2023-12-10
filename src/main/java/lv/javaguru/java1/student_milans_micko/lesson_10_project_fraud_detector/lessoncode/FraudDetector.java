package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String traderName = trader.getFullName();
        int amount = transaction.getAmount();
        String cityName = trader.getCity();
        String country = trader.getCountry();
        if (traderName.equals("Pokemon")) {
            return true;
        }
        if (amount > 1000000) {
            return true;
        }
        if (cityName.equals("Sidney")) {
            return true;
        }
        if (country.equals("Jamaica")) {
            return true;
        }
        if (country.equals("Germany")) {
            return true;
        }
        if (amount > 1000) {
            return true;
        }
        return false;
    }


}
