package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvija");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }

    @Test
    public void testCase2() {
        Trader trader = new Trader("Lacky", "Riga", "Latvija");
        Transaction transaction = new Transaction(trader, 2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }
    @Test
    public void testCase3(){
        Trader trader = new Trader("Lacky", "Riga", "Latvija");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }
    @Test
    public void testCase4(){
        Trader trader = new Trader("Lacky", "Riga", "Latvija");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }
    @Test
    public void testCase5(){
        Trader trader = new Trader("Lacky", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }
    @Test
    public void testCase6(){
        Trader trader = new Trader("Lacky", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }
    @Test
    public void testCase7(){
        Trader trader = new Trader("Lack", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }
    @Test
    public void testCase8(){
        Trader trader = new Trader("Lack", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }
    @Test
    public void testCase9(){
        Trader trader = new Trader("Lack", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }
}