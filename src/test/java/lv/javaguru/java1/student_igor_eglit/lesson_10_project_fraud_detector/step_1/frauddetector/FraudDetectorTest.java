package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }

    @Test
    public void testCase2() {
        Trader trader = new Trader("Lucky", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }
    @Test
    public void testCase3(){
        Trader trader = new Trader("Lucky", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }
    @Test
    public void testCase4(){
        Trader trader = new Trader("Lucky", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }
    @Test
    public void testCase5(){
        Trader trader = new Trader("Lucky", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }
    @Test
    public void testCase6(){
        Trader trader = new Trader("Lucky", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }
    @Test
    public void testCase7(){
        Trader trader = new Trader("Lucky", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }
    @Test
    public void testCase8(){
        Trader trader = new Trader("Lucky", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertTrue(result);
    }
    @Test
    public void testCase9(){
        Trader trader = new Trader("Lucky", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertFalse(result);
    }
}