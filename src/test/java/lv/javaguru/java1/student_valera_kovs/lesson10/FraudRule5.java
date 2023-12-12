package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled
public class FraudRule5 {

    private FraudRule5 fraudRule
            = new FraudRule5();

    @Test
    public void BeFraud() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud1000() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Alex", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void NotBeFraud() {
        Trader trader = new Trader("Alex", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 1001);
        assertFalse(fraudRule.isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        return false;
    }
}
