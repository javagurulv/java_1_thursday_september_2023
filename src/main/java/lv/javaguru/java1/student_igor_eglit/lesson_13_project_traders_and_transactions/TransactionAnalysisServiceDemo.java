package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.List;

class TransactionAnalysisServiceDemo {
    public static List<Transaction> transactions = TransactionTestData.getTransactions();

    public static void filterByYear() {
        List<Transaction> year = TransactionAnalysisService.filterByYear(transactions);
        TransactionAnalysisService.printTransactions(year);
    }

    public static void main(String[] args) {
        TransactionAnalysisServiceDemo transactionAnalysisServiceDemo = new TransactionAnalysisServiceDemo();
        filterByYear();
    }
}
