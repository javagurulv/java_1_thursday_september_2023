package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.List;

class TransactionTestData {
    static Trader trader1 = new Trader("Ivan Ivanov", "Riga");
    static Trader trader2 = new Trader("Jonh Smith", "London");
    static Trader trader3 = new Trader("Rajiv Rakesh", "New Delhi");

    public static List<Transaction> getTransactions() {
        return List.of(
                new Transaction(trader1, 2011, 1000),
                new Transaction(trader2, 2011, 1500),
                new Transaction(trader3, 2011, 150),
                new Transaction(trader3, 2011, 2000),

                new Transaction(trader2, 2012, 900),
                new Transaction(trader1, 2012, 2100),
                new Transaction(trader2, 2012, 100),
                new Transaction(trader3, 2012, 500),
                new Transaction(trader2, 2012, 1900),

                new Transaction(trader1, 2013, 1750),
                new Transaction(trader2, 2013, 2200),
                new Transaction(trader3, 2013, 3000),
                new Transaction(trader2, 2013, 100),
                new Transaction(trader1, 2013, 1200),

                new Transaction(trader2, 2014, 1000),
                new Transaction(trader3, 2014, 1900),
                new Transaction(trader2, 2014, 1300),
                new Transaction(trader1, 2014, 1150)
        );
    }
}
