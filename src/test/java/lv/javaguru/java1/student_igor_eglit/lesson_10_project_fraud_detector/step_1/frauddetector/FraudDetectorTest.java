package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    Trader trader;
    Transaction transaction;
    FraudDetector fraudDetector = new FraudDetector();
    FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(transaction);


    @Test
    void testCase1() {
        trader = new Trader("Pokemon", "Riga", "Latvia");
        transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetectionResult.isFraud());
        assertEquals(fraudDetectionResult.getRuleName(), "Rule 1");
    }

    @Test
    void testCase2() {
        trader = new Trader("Lucky", "Riga", "Latvia");
        transaction = new Transaction(trader, 1);
        assertFalse(fraudDetectionResult.isFraud());
        assertNull(fraudDetectionResult.getRuleName());
    }

    @Test
    void testCase3() {
        trader = new Trader("Lucky", "Riga", "Latvia");
        transaction = new Transaction(trader, 1000001);
        assertTrue(fraudDetectionResult.isFraud());
        assertEquals(fraudDetectionResult.getRuleName(), "Rule 2");
    }

    @Test
    void testCase4() {
        trader = new Trader("Lucky", "Riga", "Latvia");
        transaction = new Transaction(trader, 1000000);
        assertFalse(fraudDetectionResult.isFraud());
        assertNull(fraudDetectionResult.getRuleName());
    }

    @Test
    void testCase5() {
        trader = new Trader("Lucky", "Sydney", "Australia");
        transaction = new Transaction(trader, 10000);
        assertTrue(fraudDetectionResult.isFraud());
        assertEquals(fraudDetectionResult.getRuleName(), "Rule 3");
    }

    @Test
    public void testCase6() {
        trader = new Trader("Lucky", "Riga", "Jamaica");
        transaction = new Transaction(trader, 10000);
        assertTrue(fraudDetectionResult.isFraud());
        assertEquals(fraudDetectionResult.getRuleName(), "Rule 4");
    }

    @Test
    void testCase8() {
        trader = new Trader("Lucky", "Berlin", "Germany");
        transaction = new Transaction(trader, 1001);
        assertTrue(fraudDetectionResult.isFraud());
        assertEquals(fraudDetectionResult.getRuleName(), "Rule 5");
    }

    @Test
    void testCase9() {
        trader = new Trader("Lucky", "Berlin", "Germany");
        transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetectionResult.isFraud());
        assertNull(fraudDetectionResult.getRuleName());
    }
}