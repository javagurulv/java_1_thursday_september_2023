package lv.javaguru.java1.student_valera_kovs.lesson10;


class FraudDetector {

    FraudRule rule1 = new FraudRule1();
    FraudRule rule2 = new FraudRule2();
    FraudRule rule3 = new FraudRule3();
    FraudRule rule4 = new FraudRule4();
    FraudRule rule5 = new FraudRule5();

    FraudDetectionResult isFraud(Transaction transaction) {
        if (rule1.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule1");
        }
        if (rule2.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule2");
        }
        if (rule3.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule3");
        }
        if (rule4.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule4");
        }
        if (rule5.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule5");
        }
        return new FraudDetectionResult(false, null);

    }

    private class FraudRule1 extends FraudRule {
    }

    private class FraudRule2 extends FraudRule {
    }

    private class FraudRule3 extends FraudRule {
    }

    private class FraudRule4 extends FraudRule {
    }

    private class FraudRule5 extends FraudRule {
    }
}