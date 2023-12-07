package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {
    @Test
    public void testCase1() {
        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        assertEquals(result, true);
    }

}