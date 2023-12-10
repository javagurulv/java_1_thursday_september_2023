package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule1Test {

    public FraudRule fraudRule;

    @Test
    public void recognizedAsFraud() {

        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        this.fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);
        assertEquals(true, result);
    }

    @Test
    public void recognizedAsDecent() {
        Trader trader = new Trader("Lacky", "Riga", "Latvija");
        Transaction transaction = new Transaction(trader, 1000);
        this.fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);
        assertEquals(false, result);
    }
}