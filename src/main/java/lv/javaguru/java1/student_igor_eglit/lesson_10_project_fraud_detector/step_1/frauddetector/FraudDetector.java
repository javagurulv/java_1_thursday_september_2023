package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        FraudRule fraudRule1 = new FraudRule1();
        FraudRule fraudRule2 = new FraudRule2();
        FraudRule fraudRule3 = new FraudRule3();
        FraudRule fraudRule4 = new FraudRule4();
        FraudRule fraudRule5 = new FraudRule5();

        if ((fraudRule1.isFraud(transaction) ||
                fraudRule2.isFraud(transaction) ||
                fraudRule3.isFraud(transaction) ||
                fraudRule4.isFraud(transaction) ||
                fraudRule5.isFraud(transaction))) {
            return true;
        }
        return false;
//        Trader trader = transaction.getTrader();
//        String traderName = trader.getFullName();
//        int amount = transaction.getAmount();
//        String city = trader.getCity();
//        String country = trader.getCountry();
//
//        if (traderName.equals("Pokemon")) {
//            return true;
//        }
//        if (amount > 1000000) {
//            return true;
//        }
//        if (city.equals("Sydney")) {
//            return true;
//        }
//        if (country.equals("Jamaica")) {
//            return true;
//        }
//        if (country.equals("Germany") && amount > 1000) {
//            return true;
//        }
//        return false;
//
//    }
    }

}
