package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FraudRuleTest1 {

    private FraudRule1 fraudRule = new FraudRule1();

    @Test
    public void shouldBeFraud() {
        Trader trader = new Trader("Pokemon", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertEquals(true, fraudRule.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraud() {
        Trader trader = new Trader("Zorro", "Kingston", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        assertFalse(fraudRule.isFraud(transaction));
    }


}
