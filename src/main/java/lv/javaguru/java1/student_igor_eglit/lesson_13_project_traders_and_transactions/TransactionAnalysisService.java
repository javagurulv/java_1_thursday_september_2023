package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    static List<Transaction> filterByYear(List<Transaction> transactions, int transactionYear) {
        return transactions.stream().
                filter(year -> year.getYear() == transactionYear)
                .collect(Collectors.toList());
    }

    static List<Transaction> sortValueAsc(List<Transaction> transactions) {
        return transactions.stream().
                sorted(Comparator.comparing(Transaction::getValue)).
                collect(Collectors.toList());
    }

    static List<Transaction> sortValueDsc(List<Transaction> transactions) {
        return transactions.stream().
                sorted(Comparator.comparing(Transaction::getValue).reversed()).
                collect(Collectors.toList());
    }

    static List<Transaction> filterAndSort(List<Transaction> transactions, int transactionYear) {
        return transactions.stream().
                filter(year -> year.getYear() == transactionYear)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    static List<Integer> collectingYears(List<Transaction> transactions) {
        return transactions.stream().
                map(Transaction::getYear).
                distinct().collect(Collectors.toList());
    }

    static List<String> collectingUniqueNames(List<Transaction> transactions) {
        return transactions.stream().
                map(trader -> trader.getTrader().getName()).
                distinct().collect(Collectors.toList());
    }

    static List<String> collectingUniqueCity(List<Transaction> transactions) {
        return transactions.stream().
                map(trader -> trader.getTrader().getCity()).
                distinct().collect(Collectors.toList());
    }

    static List<String> collectingTradersNameFromCity(List<Transaction> transactions, String city) {
        return transactions.stream().
                filter(trader -> trader.getTrader().getCity().equals(city)).
                map(trader -> trader.getTrader().getName()).
                distinct().collect(Collectors.toList());
    }

    static int sumAllTransactionVolume(List<Transaction> transactions) {
        return transactions.stream().
                mapToInt(Transaction::getValue).sum();

    }

    static int calculateNumbersOfTransactionsOfTheYear(List<Transaction> transactions, int transactionYear) {
        return transactions.stream().
                filter(year -> year.getYear() == transactionYear).
                toList().
                size();
    }

    static String traderWithMostTransactionsDone(List<Transaction> transactions) {
        return transactions.stream().
                map(trader -> trader.getTrader().getName()).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).toString();
    }

   /* static String traderWithMostTransactionsValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(trader -> trader.getTrader().getName())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.summingInt(Transaction::getValue)))
                .maxBy(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");

    }*/
    static String findTraderWithMinTransaction(List<Transaction> transactions){
        return String.valueOf(transactions.stream().min(Comparator.comparing(Transaction::getValue)).orElse(null));
    }
    static String findTraderWithMaxTransaction(List<Transaction> transactions){
        return String.valueOf(transactions.stream().max(Comparator.comparing(Transaction::getValue)).orElse(null));
    }

    public static void printTransactions(List<Transaction> transactions) {
        transactions.forEach(System.out::println);
    }
}
