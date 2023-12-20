package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.jupiter.api.Disabled;



@Disabled
class FraudRule5 extends FraudRule {

        @Override
        public boolean isFraud (Transaction transaction){
            Trader trader = transaction.getTrader();
            if (trader.getCountry().equals("Germany") && transaction.getAmount() > 1000) {
                return true;
            }
            return false;
        }

        @Override
        public String getRuleName () {
            return "FraudRule5";
        }
    }
