package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
class FraudRule4 extends FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }

    @Override
    public String getRuleName() {
        return "FraudRelu4";
    }
}