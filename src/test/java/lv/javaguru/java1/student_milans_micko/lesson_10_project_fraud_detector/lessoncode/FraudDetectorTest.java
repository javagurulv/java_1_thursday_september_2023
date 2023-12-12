package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);
    }
    @Test
    public void testCase2() {
        Trader trader = new Trader("Napoleon", "Ajaccio", "Italy");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, false);
    }
    @Test
    public void testCase3() {
        Trader trader = new Trader("Bertier", "Nant", "Germany");
        Transaction transaction = new Transaction(trader, 10000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);

    }

    @Test
    public void testCase4() {
        Trader trader = new Trader("Bertier", "Nant", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);

    }
    @Test
    public void testCase5() {
        Trader trader = new Trader("Massena", "Sidney", "France");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);

    }
    @Test
    public void testCase6() {
        Trader trader = new Trader("Massena", "Paris", "France");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, false);

    }
    @Test
    public void testCase7() {
        Trader trader = new Trader("Lann", "Marseille", "Jamaica");
        Transaction transaction = new Transaction(trader, 100000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);
    }
    @Test
    public void testCase8() {
        Trader trader = new Trader("Lann", "Marseille", "Marocco");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, false);

    }
    @Test
    public void testCase9() {
        Trader trader = new Trader("Soult", "Marseille", "Germany");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);
    }
    @Test
    public void testCase10() {
        Trader trader = new Trader("Soult", "Marseille", "Estonia");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, false);

    }

}