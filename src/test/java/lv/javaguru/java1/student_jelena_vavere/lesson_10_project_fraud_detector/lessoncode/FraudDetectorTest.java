package lv.javaguru.java1.student_jelena_vavere.lesson_10_project_fraud_detector.lessoncode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga", "Sidney");
        Transaction transaction = new Transaction(1000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(true, result.isFraud());
    }

    @Test
    public void testCase3() {
        Trader trader = new Trader("Katja", "Riga", "Sidney");
        Transaction transaction = new Transaction(100000000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(true, result.isFraud());
    }

    @Test
    public void testCase4() {
        Trader trader = new Trader("Katja", "Riga", "Sidney");
        Transaction transaction = new Transaction(100000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(false, result.isFraud());
    }

    @Test
    public void testCase5() {
        Trader trader = new Trader("Katja", "Riga", "Sidney");
        Transaction transaction = new Transaction(1000000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(false, result.isFraud());
    }

    @Test
    public void testCase6() {
        Trader trader = new Trader("Katja", "Riga", "Sidney");
        Transaction transaction = new Transaction(10000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(false, result.isFraud());
    }

    @Test
    public void testCase7() {
        Trader trader = new Trader("Katja", "Riga", "Germany");
        Transaction transaction = new Transaction(1000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(false, result.isFraud());
    }

    @Test
    public void testCase8() {
        Trader trader = new Trader("Katja", "Riga", "Italy");
        Transaction transaction = new Transaction(1000, trader);
        FraudDetector fraudDetector = new FraudDetector();
        var result = fraudDetector.isFraud((transaction));
        assertEquals(false, result.isFraud());
    }
}
      /*  @Test
        public void testCase2 () {
            Trader trader = new Trader("Jelena", "Riga");
            Transaction transaction = new Transaction(1000, trader);
            FraudDetector fraudDetector = new FraudDetector();
            boolean result = fraudDetector.isFraud((transaction));
            assertEquals(false, result);
        }

    }
*/
