package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson13Trader;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TransactionAnalysisService2 {

    List<Transaction> findTransactionYear2011(List<Transaction> transactions) {
        List<Transaction> transactions2011 = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getYear() == 2011) {
                transactions2011.add(transaction);
            }
        }
        return transactions2011;
    }

    public List<Transaction> findAllTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionByValueAsc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

    }

    public List<Transaction> sortTransactionByValueDesc(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());

    }

    public List<Transaction> findAllTransactionsByYearAndSorByValuetAsc(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public List<Integer> findTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public Set<Integer> findUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());

    }

    public Set<String> findUniqueTraderNames(List<Transaction> transactions) {
        Set<String> collect = transactions.stream()
                .map(Transaction::getTrader)
                .map((String t) -> Trader.getName(t))
                .collect(Collectors.toSet());
        return collect;
    }

    public Set<String> findUniqueTraderCities(List<Transaction> transactions) {
        Set<String> collect = transactions.stream()
                .map(Transaction::getTrader)
                .map((String t) -> Trader.getCity(t))
                .collect(Collectors.toSet());
        return collect;

    }
}













