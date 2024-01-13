package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.*;

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

    public static void collectUniqueTraders() {
        List<String> tradersCollected = TransactionAnalysisService.collectingUniqueNames(transactions);
        tradersCollected.forEach(System.out::println);
    }

    public static void collectingTradersNameFromCity() {
        List<String> tradersCollected = TransactionAnalysisService.collectingTradersNameFromCity(transactions, "Riga");
        tradersCollected.forEach(System.out::println);
    }

    public static void traderWithMostEntries() {
        System.out.println(TransactionAnalysisService.findTraderWithMostEntriesOldSchool(transactions));
    }

    public static void traderWithMostTotalValueTransaction() {
        System.out.println(TransactionAnalysisService.findTraderWIthMostTotalTransactionValue(transactions));
    }

    public static void findMinTransaction() {
        int value = TransactionAnalysisService.findMinTransactionValue(transactions);
        System.out.println(value);
    }

    public static void findMaxTransactionValue() {
        int value = TransactionAnalysisService.findMaxTransactionValue(transactions);
        System.out.println(value);
    }

    public static void findAverageValue() {
        System.out.println(TransactionAnalysisService.findAverageValue(transactions));

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
//        collectUniqueTraders();
//        System.out.println("Unique traders from Riga");
//        collectingTradersNameFromCity();
        System.out.println("Trader with most entries ");
        traderWithMostEntries();
        System.out.println("Find min Transaction Value");
        findMinTransaction();
        System.out.println("Find max Transaction Value");
        findMaxTransactionValue();
        System.out.println("Find average transaction value");
        findAverageValue();
        System.out.println("Find trader with the most Total value");
        traderWithMostTotalValueTransaction();
    }
}
