package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
public class FraudRule3 {

    private FraudRule3 fraudRule = new FraudRule3();

    @Test
    public void BeFraud() {
        Trader trader = new Trader("Alex", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void NotBeFraud() {
        Trader trader = new Trader("Alex", "Berline", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        return false;
    }

}
