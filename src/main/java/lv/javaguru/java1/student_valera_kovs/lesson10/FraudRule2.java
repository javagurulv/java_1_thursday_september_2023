package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule2 {

    private FraudRule2 fraudRule = new FraudRule2();

    @Test
    public void BeFraud() {
        Trader trader = new Trader("Alex", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 1000001);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void NotBeFraud_1000000() {
        Trader trader = new Trader("Alex", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 1000000);
        assertFalse(fraudRule.isFraud(transaction));
    }

    @Test
    public void NotBeFraud() {
        Trader trader = new Trader("Alex", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 10);
        assertFalse(fraudRule.isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {

        return false;
    }


}


