package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class FraudDetector {
    private List<FraudRule> fraudRules;

    public FraudDetector() {
        fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1());
        fraudRules.add(new FraudRule2());
        fraudRules.add(new FraudRule3());
        fraudRules.add(new FraudRule4());
    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);

    }
}



   /* boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String traderName = trader.getFullName();
        String city = trader.getCity();
        int amount = transaction.getAmount();

        if (traderName.equals("Pokemon")) {
            return true;
        }
            if (amount> 1000000){
                return  true;
            }
            if (trader.getCity().equals("Sidney")){
                return true;
            }
            if (trader.getCountry().equals("Jamaica")) {
                return true;
            }

            if (trader.getCountry().equals("Germany")) {
                return true;
            }

            if (amount> 1000) {
                return true;
            }
            return  false;
        }
    }
*/

