package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        Trader trader = transaction.getTrader();
        String traderName = trader.getFullName();
        int amount = transaction.getAmount();
        String city = trader.getCity();
        String country = trader.getCountry();
        if (traderName.equals("Pokemon")) {
            return true;
        }
        if (amount > 1000000) {
            return true;
        }
        if (city.equals("Sidney")){
            return true;
        }
        if (country.equals("Jamaica")){
            return true;
        }
        return false;
    }
}





