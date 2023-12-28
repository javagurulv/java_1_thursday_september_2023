package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.List;

class TransactionAnalysisServiceDemo {
    public static List<Transaction> transactions = TransactionTestData.getTransactions();

    public static void filterByYear() {
        List<Transaction> year = TransactionAnalysisService.filterByYear(transactions, 2011);
        TransactionAnalysisService.printTransactions(year);
    }
    public static void sortByValueAsc(){
        List<Transaction> sorted = TransactionAnalysisService.sortValueAsc(transactions);
        TransactionAnalysisService.printTransactions(sorted);
    }
    public static void sortByValueDsc(){
        List<Transaction> sorted = TransactionAnalysisService.sortValueDsc(transactions);
        TransactionAnalysisService.printTransactions(sorted);
    }

    public static void main(String[] args) {
//        filterByYear();
//        System.out.println("Sorted by Value Asc");
//        sortByValueAsc();
        System.out.println("Sorted by Value Dsc");
        sortByValueDsc();
    }
}
