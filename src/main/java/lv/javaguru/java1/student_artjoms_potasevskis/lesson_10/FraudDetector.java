package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;


class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String tradeName = trader.getFullName();
        int amount = transaction.getAmount();
        String city = trader.getCity();

        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (amount > 1000000) {

            return true;
        }
        if (city.equals("Sidney")) {
            return true;
        }
        if (trader.getCountry().equals("Germany")
        && transaction.getAmount() > 1000) {
            return true;
        }

        return false;
    }
}

