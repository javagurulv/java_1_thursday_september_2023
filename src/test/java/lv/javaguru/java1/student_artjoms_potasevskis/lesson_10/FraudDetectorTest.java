package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    @Test
    public void testCase1() {
        Trader trader = new Trader("Riga", "Pokemon", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }

    @Test
    public void testCase2() {
        Trader trader = new Trader("Riga", "Artjom", "Estonia");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }

    @Test
    public void testCase3() {

        Trader trader = new Trader("Riga", "Demid", "Lithuania");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);


    }

    @Test

    public void testCase4() {

        Trader trader = new Trader("Riga", "Artjom", "Spain");
        Transaction transaction = new Transaction(trader, 10000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);

    }

    @Test
    public void testCase5() {

        Trader trader = new Trader("Sidney", "Artjom", "Australia");
        Transaction transaction = new Transaction(trader, 12000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);

    }

    @Test
    public void testCase6() {

        Trader trader = new Trader("Giga", "Artjom", "Jamaica");
        Transaction transaction = new Transaction(trader, 12000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }

    @Test
    public void testCase7() {

        Trader trader = new Trader("Hamburg", "Ivan", "Germany");
        Transaction transaction = new Transaction(trader, 14000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(true, result);
    }
    @Test
    public void testCase8() {

        Trader trader = new Trader("Hamburg", "Ivan", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(false, result);
    }

}

