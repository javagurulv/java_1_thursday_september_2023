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
//    public static void traderWithMostTransactionsDone(){
//        String trader = TransactionAnalysisService.traderWithMostTransactionsDone(transactions);
//        System.out.println(trader);}


public static void traderWithMinTransaction() {
    String trader = TransactionAnalysisService.findTraderWithMinTransaction(transactions);
    System.out.println(trader);
}

public static void traderWithMaxTransaction() {
    String trader = TransactionAnalysisService.findTraderWithMaxTransaction(transactions);
    System.out.println(trader);
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
//        System.out.println("Trader with most Transactions Done");
//        traderWithMostTransactionsDone();
//        System.out.println("Trader with min Transaction");
//        traderWithMinTransaction();
//        System.out.println("Trader with max Transaction");
//        traderWithMaxTransaction();
}
}
