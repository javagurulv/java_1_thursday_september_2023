package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;




class FraudRule2FraudRule2 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
