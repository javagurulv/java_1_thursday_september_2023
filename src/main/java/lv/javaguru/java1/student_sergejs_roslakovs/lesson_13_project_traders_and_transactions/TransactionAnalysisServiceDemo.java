package lv.javaguru.java1.student_sergejs_roslakovs.lesson_13_project_traders_and_transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TransactionAnalysisServiceDemo {
    private static List<Transaction> transactions = new ArrayList<Transaction>();
    private static TransactionAnalysisService transactionService = new TransactionAnalysisService();

    public static void main(String[] args) {
        generateTransactions();
        listTransactions(transactions);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions in 2011:");
        List<Transaction> transactions2011 = transactionService.findAllTransactionsMadeIn2011(transactions);
        listTransactions(transactions2011);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions in 2012:");
        List<Transaction> transactions2012 = transactionService.findAllTransactionsByYear(transactions, 2012);
        listTransactions(transactions2012);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions in 2013:");
        List<Transaction> transactions2013 = transactionService.findAllTransactionsByYear(transactions, 2013);
        listTransactions(transactions2013);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions sorted ascending:");
        List<Transaction> transactionsAsc = transactionService.sortTransactionByValueAsc(transactions);
        listTransactions(transactionsAsc);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions sorted descending:");
        List<Transaction> transactionsDesc = transactionService.sortTransactionByValueDesc(transactions);
        listTransactions(transactionsDesc);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions in 2011 sorted ascending:");
        List<Transaction> transactions2011asc = transactionService.findAllTransactionsByYearAndSorByValuetAsc(transactions, 2011);
        listTransactions(transactions2011asc);
        System.out.println("-------------------------------------------------------");
        System.out.println("All transaction years:");
        List<Integer> transactionsYears = transactionService.findTransactionYears(transactions);
        listYears(transactionsYears);
        System.out.println("-------------------------------------------------------");
        System.out.println("All distinct transaction years:");
        Set<Integer> transactionsYearsDistinct = transactionService.findUniqueTransactionYears(transactions);
        listYears(transactionsYearsDistinct);
        System.out.println("-------------------------------------------------------");
        System.out.println("All distinct trader names:");
        Set<String> traderNamesDistinct = transactionService.findUniqueTraderNames(transactions);
        listTraderDetails(traderNamesDistinct);
        System.out.println("-------------------------------------------------------");
        System.out.println("All distinct trader cities:");
        Set<String> traderCitiesDistinct = transactionService.findUniqueTraderCities(transactions);
        listTraderDetails(traderCitiesDistinct);
        System.out.println("-------------------------------------------------------");
        System.out.println("All distinct trader names from Riga:");
        Set<String> traderNamesDistinctfromRiga = transactionService.findUniqueTraderNamesFromRiga(transactions);
        listTraderDetails(traderNamesDistinctfromRiga);
        System.out.println("-------------------------------------------------------");
        System.out.println("All distinct trader names from Tallin:");
        Set<String> traderNamesDistinctfromTallin = transactionService.findUniqueTraderNamesByCity(transactions, "Tallin");
        listTraderDetails(traderNamesDistinctfromTallin);
        System.out.println("-------------------------------------------------------");
        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("--------------------- BONUS TASKS ---------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Total transactions value for year 2011:");
        int iTotalTransactionValue2011 = transactionService.findSumOfAllTransactionsByYear(transactions, 2011);
        System.out.println(String.valueOf(iTotalTransactionValue2011));
        System.out.println("-------------------------------------------------------");
        System.out.println("Total transactions count for year 2011:");
        long iTotalTransactioncount2011 = transactionService.findCountOfAllTransactionsByYear(transactions, 2011);
        System.out.println(String.valueOf(iTotalTransactioncount2011));
        System.out.println("-------------------------------------------------------");
        System.out.println("Trader with most transactions count:");
        String sTraderWithMostTransactionsResult = transactionService.findTraderWithMostTransactions(transactions);
        System.out.println(sTraderWithMostTransactionsResult);
        System.out.println("-------------------------------------------------------");
        System.out.println("Most succesfull Trader:");
        String sMostEfficientTraderResult = transactionService.findMostEfficientTrader(transactions);
        System.out.println(sMostEfficientTraderResult);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions with lowest value:");
        List<Transaction> transactionsWithLowestVAlue = transactionService.getTransactionsWithLowestValue(transactions);
        listTransactions(transactionsWithLowestVAlue);
        System.out.println("-------------------------------------------------------");
        System.out.println("Transactions with highest value:");
        List<Transaction> transactionsWithHighestVAlue = transactionService.getTransactionsWithHighestValue(transactions);
        listTransactions(transactionsWithHighestVAlue);
        System.out.println("-------------------------------------------------------");
        System.out.println("Average value of all transactions:");
        double averageFromAllTransactions = transactionService.getAverageFromAllTransactions(transactions);
        System.out.println(String.valueOf(averageFromAllTransactions));
        System.out.println("-------------------------------------------------------");
    }

    private static void generateTransactions() {
        Trader trader = new Trader("John", "Riga");
        Transaction transaction = new Transaction(trader, 2011, 900);
        transactions.add(transaction);
        trader = new Trader("Scott", "Tallin");
        transaction = new Transaction(trader, 2012, 200);
        transactions.add(transaction);
        trader = new Trader("Daniel", "Tallin");
        transaction = new Transaction(trader, 2011, 800);
        transactions.add(transaction);
        trader = new Trader("John", "Vilnius");
        transaction = new Transaction(trader, 2012, 400);
        transactions.add(transaction);
        trader = new Trader("Vanja", "Riga");
        transaction = new Transaction(trader, 2013, 50);
        transactions.add(transaction);
        trader = new Trader("Daniel", "Tallin");
        transaction = new Transaction(trader, 2013, 300);
        transactions.add(transaction);
        trader = new Trader("John", "Vilnius");
        transaction = new Transaction(trader, 2011, 50);
        transactions.add(transaction);
        trader = new Trader("John", "Vilnius");
        transaction = new Transaction(trader, 2011, 90);
        transactions.add(transaction);
    }

    private static void listTransactions(List<Transaction> transactions) {
        transactions.forEach((n) -> System.out.println(n));
    }

    private static void listYears(List<Integer> years) {
        years.forEach((n) -> System.out.println(n));
    }

    private static void listYears(Set<Integer> years) {
        years.forEach((n) -> System.out.println(n));
    }

    private static void listTraderDetails(Set<String> details) {
        details.forEach((n) -> System.out.println(n));
    }


}

