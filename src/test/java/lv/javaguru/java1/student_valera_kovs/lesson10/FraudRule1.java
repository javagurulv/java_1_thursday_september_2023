package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@Disabled
class FraudRule1 extends FraudRule {


    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "FraudRule1";
    }
}