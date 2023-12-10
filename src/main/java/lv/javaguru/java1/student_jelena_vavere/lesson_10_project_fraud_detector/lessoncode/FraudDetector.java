package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
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
            if (trader.getCountry().equals("Jamica")) {
                return true;
            }
            return  false;
        }
    }


