package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule1");
    }
    @Test
    public void testCase2() {
        Trader trader = new Trader("Napoleon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
    @Test
    public void testCase3() {
        Trader trader = new Trader("Bertier", "Nant", "Germany");
        Transaction transaction = new Transaction(trader, 10000000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule2");
    }

    @Test
    public void testCase4() {
        Trader trader = new Trader("Bertier", "Nant", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
    @Test
    public void testCase5() {
        Trader trader = new Trader("Massena", "Sidney", "France");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule3");
    }
    @Test
    public void testCase6() {
        Trader trader = new Trader("Massena", "Paris", "France");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
    @Test
    public void testCase7() {
        Trader trader = new Trader("Lann", "Marseille", "Jamaica");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule4");
    }
    @Test
    public void testCase8() {
        Trader trader = new Trader("Lann", "Marseille", "Marocco");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
    @Test
    public void testCase9() {
        Trader trader = new Trader("Soult", "Marseille", "Germany");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertTrue(result.isFraud());
        assertEquals(result.getRuleName(), "FraudRule5");
    }
    @Test
    public void testCase10() {
        Trader trader = new Trader("Soult", "Marseille", "Estonia");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        assertFalse(result.isFraud());
        assertNull(result.getRuleName());
    }
}