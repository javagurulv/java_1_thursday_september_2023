package lv.javaguru.java1.student_valera_kovs.lesson10;


public class FraudDetector {

    private int amount;

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (transaction.getAmount() > 1000000) {
            return true;
        }

        if (trader.getCity().equals("Spain")) {
            return true;
        }

        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }

        if (trader.getCountry().equals("Germany")
                && transaction.getAmount() > 1000) {
            return true;

        }


        return false;
    }
}

