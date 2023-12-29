package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.Comparator;
import java.util.List;
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
    static List<Transaction> filterAndSort(List<Transaction> transactions, int transactionYear){
        return transactions.stream().
                filter(year -> year.getYear() == transactionYear)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    static List<Integer> collectingYears(List<Transaction> transactions){
        return transactions.stream().
                map(Transaction::getYear).
                distinct().collect(Collectors.toList());
    }
    static List<String> collectingUniqueNames(List<Transaction> transactions) {
        return transactions.stream().
                map(transaction -> transaction.getTrader().getName()).
                distinct().collect(Collectors.toList());
    }
    static List<String> collectingUniqueCity(List<Transaction> transactions) {
        return transactions.stream().
                map(transaction -> transaction.getTrader().getCity()).
                distinct().collect(Collectors.toList());
    }
    static List<String> collectingTradersNameFromCity(List<Transaction> transactions) {
        return transactions.stream().
                filter(transaction -> transaction.getTrader().getCity().equals("Riga")).
                map(transaction -> transaction.getTrader().getName()).
                distinct().collect(Collectors.toList());
    }

    public static void printTransactions(List<Transaction> transactions) {
        transactions.forEach(System.out::println);
    }
}
