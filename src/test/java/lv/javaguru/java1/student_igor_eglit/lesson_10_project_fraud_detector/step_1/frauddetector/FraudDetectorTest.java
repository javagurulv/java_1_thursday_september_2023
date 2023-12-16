package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    void testCase1() {
        var trader = new Trader("Pokemon", "Riga", "Latvia");
        var transaction = new Transaction(trader, 1000);
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "Rule 1");
    }

    @Test
    void testCase2() {
        var trader = new Trader("Lucky", "Riga", "Latvia");
        var transaction = new Transaction(trader, 1);
        var result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

    @Test
    void testCase3() {
        var trader = new Trader("Lucky", "Riga", "Latvia");
        var transaction = new Transaction(trader, 1000001);
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "Rule 2");
    }

    @Test
    void testCase4() {
        var trader = new Trader("Lucky", "Riga", "Latvia");
        var transaction = new Transaction(trader, 1000000);
        var result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }

    @Test
    void testCase5() {
        var trader = new Trader("Lucky", "Sydney", "Australia");
        var transaction = new Transaction(trader, 10000);
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "Rule 3");
    }

    @Test
    public void testCase6() {
        var trader = new Trader("Lucky", "Riga", "Jamaica");
        var transaction = new Transaction(trader, 10000);
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "Rule 4");
    }

    @Test
    void testCase8() {
        var trader = new Trader("Lucky", "Berlin", "Germany");
        var transaction = new Transaction(trader, 1001);
        var result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "Rule 5");
    }

    @Test
    void testCase9() {
        var trader = new Trader("Lucky", "Berlin", "Germany");
        var transaction = new Transaction(trader, 1000);
        var result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
}