package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.Test;


import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class FraudRule1 {

    private FraudRule1 fraudRule = new FraudRule1();

    @Test
    public void BeFraud() {
        Trader trader = new Trader("Pokemon", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 104);
        assertTrue(fraudRule.isFraud(transaction));
    }

    @Test
    public void NotBeFraud() {
        Trader trader = new Trader("Alex", "Madride", "Spain");
        Transaction transaction = new Transaction(trader, 104);
        assertFalse(fraudRule.isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {

        return false;
    }


}