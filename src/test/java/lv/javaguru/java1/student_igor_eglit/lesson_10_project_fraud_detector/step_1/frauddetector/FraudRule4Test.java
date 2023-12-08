package lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.step_1.frauddetector;

import lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.frauddetector.FraudRule;
import lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.frauddetector.FraudRule4;
import lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.frauddetector.Trader;
import lv.javaguru.java1.student_igor_eglit.lesson_10_project_fraud_detector.frauddetector.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule4Test {
    public FraudRule fraudRule;

    @Test
    public void recognizedAsFraud() {

        Trader trader = new Trader("Lacky", "Riga", "Jamaica");
        Transaction transaction = new Transaction(trader, 1_000);
        this.fraudRule = new FraudRule4();
        boolean result = fraudRule.isFraud(transaction);
        assertEquals(true, result);
    }

    @Test
    public void recognizedAsDecent() {
        Trader trader = new Trader("Lacky", "Riga", "Latvija");
        Transaction transaction = new Transaction(trader, 1_000);
        this.fraudRule = new FraudRule4();
        boolean result = fraudRule.isFraud(transaction);
        assertEquals(false, result);
    }


}