package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon","Riga","Jamaica");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);
    }
    @Test
    public void testCase2(){
        Trader trader = new Trader("Feliks","London","England");
        Transaction transaction = new Transaction(trader, 20000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result,false);

    }
    @Test
    public void testCase3() {
        Trader trader = new Trader("Aksel","Tallinn","Jamaica");
        Transaction transaction = new Transaction(trader, 2000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result,true);

    }
    @Test
    public void testCase4() {
        Trader trader = new Trader("Vladimir","Sidney","Jamaica");
        Transaction transaction = new Transaction(trader, 400000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result,true);

    }

}

