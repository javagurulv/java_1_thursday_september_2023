package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FraudDetectorTest {
    private FraudDetector fraudDetector = new FraudDetector();
    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(),"rule1");
    }

    @Test
    public void testCase2() {
        Trader trader = new Trader("Feliks", "London", "England");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(),"rule2");

    }

    @Test
    public void testCase3() {
        Trader trader = new Trader("Aksel", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 200000);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(),"rule3");

    }

    @Test
    public void testCase4() {
        Trader trader = new Trader("Vladimir", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 400000);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(),"rule4");

    }

    @Test
    public void testCase5() {
        Trader trader = new Trader("German", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 4000);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(),"rule5");

    }
}


