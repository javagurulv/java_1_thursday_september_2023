package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

class FraudRule1{
    boolean isFraud(Transaction transaction){
        Trader trader = transaction.getTrader();
        return trader.getFullName().equals("Pokemon");


    }
}


