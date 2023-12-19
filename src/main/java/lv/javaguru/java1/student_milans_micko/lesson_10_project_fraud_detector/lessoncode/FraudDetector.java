package lv.javaguru.java1.student_milans_micko.lesson_10_project_fraud_detector.lessoncode;

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



/*    boolean isFraud(Transaction transaction) {

        FraudRule rule1 = new FraudRule1();
        FraudRule rule2 = new FraudRule2();
        FraudRule rule3 = new FraudRule3();
        FraudRule rule4 = new FraudRule4();
        FraudRule rule5 = new FraudRule5();

        if ((rule1.isFraud(transaction) ||
                rule2.isFraud (transaction) ||
                rule3.isFraud (transaction) ||
                rule4.isFraud (transaction) ||
                rule5.isFraud (transaction))) {
            return true;
        }
        return false;
*/
/*        Trader trader = transaction.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        if (transaction.getAmount() > 1000000) {
            return true;
        }
        if (trader.getCity().equals("Sidney")) {
            return true;
        }
        if (trader.getCity().equals("Jamaica")) {
            return true;
        }
        if (trader.getCountry().equals ("Germany") && transaction.getAmount() > 1000) {
            return true;
        }
        return false;
*/    }


}
