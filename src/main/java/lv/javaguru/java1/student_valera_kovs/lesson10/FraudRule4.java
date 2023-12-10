package lv.javaguru.java1.student_valera_kovs.lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FraudRule4 {

    private FraudRule4 fraudRule = new FraudRule4();
    @Test
    public void BeFraud() {
        Trader trader = new Trader("Zorro", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        assertTrue(fraudRule.isFraud(transaction));
    }


    @Test
    public void NotBeFraud() {
        Trader trader = new Trader("Zorro", "Kingston", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }

    private boolean isFraud(Transaction transaction) {
        return false;
    }

}

