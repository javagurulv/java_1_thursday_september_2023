package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

class FraudDetector {

    public boolean isFraud(Transaction transaction) {
        FraudRule1 rule1 = new FraudRule1();
        FraudRule2 rule2 = new FraudRule2();
        FraudRule3 rule3 = new FraudRule3();

        return rule1.isFraud(transaction)
                || rule2.isFraud(transaction)
                || rule3.isFraud(transaction);







/*
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
        if (country.equals("Germany") && amount > 1000){
            return true;
        }
        return false;
    }
}
*/

    }
    }