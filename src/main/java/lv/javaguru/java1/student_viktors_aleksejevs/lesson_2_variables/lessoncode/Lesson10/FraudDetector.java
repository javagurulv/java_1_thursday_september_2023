package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

import java.util.ArrayList;
import java.util.List;

public class FraudDetector {

    public FraudDetectionResult isFraud(Transaction transaction) {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1());
        fraudRules.add(new FraudRule2());
        fraudRules.add(new FraudRule3());
        fraudRules.add(new FraudRule4());
        fraudRules.add(new FraudRule5());

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                return new FraudDetectionResult(true, fraudRule.getName());
            }
        }
            return new FraudDetectionResult(false, null);
        }
    }








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


