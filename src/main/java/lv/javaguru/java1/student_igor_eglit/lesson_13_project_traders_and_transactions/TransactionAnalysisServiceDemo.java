package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.List;

class TransactionAnalysisServiceDemo {
    public static List<Transaction> transactions = TransactionTestData.getTransactions();

    public static void filterByYear() {
        List<Transaction> year = TransactionAnalysisService.filterByYear(transactions, 2011);
        TransactionAnalysisService.printTransactions(year);
    }

    public static void sortByValueAsc() {
        List<Transaction> sorted = TransactionAnalysisService.sortValueAsc(transactions);
        TransactionAnalysisService.printTransactions(sorted);
    }

    public static void sortByValueDsc() {
        List<Transaction> sorted = TransactionAnalysisService.sortValueDsc(transactions);
        TransactionAnalysisService.printTransactions(sorted);
    }

    public static void sortAndFilter() {
        List<Transaction> sorted = TransactionAnalysisService.filterAndSort(transactions, 2011);
        TransactionAnalysisService.printTransactions(sorted);
    }

    public static void searchAllYEars() {
        List<Integer> yearsCollected = TransactionAnalysisService.collectingYears(transactions);
        yearsCollected.forEach(System.out::println);
    }
    public static void collectUniqueNames(){
        List<String> tradersCollected = TransactionAnalysisService.collectingUniqueNames(transactions);
        tradersCollected.forEach(System.out::println);
    }
    public static void collectUniqueCity(){
        List<String> tradersCollected = TransactionAnalysisService.collectingUniqueCity(transactions);
        tradersCollected.forEach(System.out::println);
    }

    public static void main(String[] args) {
//        filterByYear();
//        System.out.println("Sorted by Value Asc");
//        sortByValueAsc();
//        System.out.println("Sorted by Value Dsc");
//        sortByValueDsc();
//        System.out.println("sort and filter");
//        sortAndFilter();
//        System.out.println("Year collected");
//        searchAllYEars();
//        System.out.println("Names collected");
//        collectUniqueNames();
        System.out.println("Cities collected");
        collectUniqueCity();

    }
}
