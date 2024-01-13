package lv.javaguru.java1.student_sergejs_roslakovs.lesson_13_project_traders_and_transactions;

import java.util.*;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findAllTransactionsMadeIn2011(List<Transaction> transactions) {
        return transactions.stream().filter(t -> t.getYear() == 2011).collect(Collectors.toList());
    }

    public List<Transaction> findAllTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream().filter(t -> t.getYear() == year).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionByValueAsc(List<Transaction> transactions) {
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionByValueDesc(List<Transaction> transactions) {
        return transactions.stream().sorted(Comparator.comparingInt(Transaction::getValue).reversed()).collect(Collectors.toList());
    }

    public List<Transaction> findAllTransactionsByYearAndSorByValuetAsc(List<Transaction> transactions, int year) {
        return transactions.stream().filter(t -> t.getYear() == year).sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
    }

    public List<Integer> findTransactionYears(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toList());
    }

    public Set<Integer> findUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getYear).collect(Collectors.toSet());
    }

    public Set<String> findUniqueTraderNames(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).map(Trader::getName).collect(Collectors.toSet());
    }

    public Set<String> findUniqueTraderCities(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).map(Trader::getCity).collect(Collectors.toSet());
    }

    public Set<String> findUniqueTraderNamesFromRiga(List<Transaction> transactions) {
        return transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Riga")).map(Trader::getName).collect(Collectors.toSet());
    }

    public Set<String> findUniqueTraderNamesByCity(List<Transaction> transactions, String city) {
        return transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals(city)).map(Trader::getName).collect(Collectors.toSet());
    }

    // Bonus tasks methods

    public int findSumOfAllTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream().filter(t -> t.getYear() == year).mapToInt(Transaction::getValue).sum();
    }

    public long findCountOfAllTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream().filter(t -> t.getYear() == year).count();
    }

    public String findTraderWithMostTransactions(List<Transaction> transactions) {
        Map<String, Integer> traderPerformance = new HashMap<>();

        for (Transaction transaction : transactions) {
            traderPerformance.merge(transaction.getTrader().toString(), 1, Integer::sum);
        }

        String traderWithHighestTotalTransactionCount = null;
        int iHighestTotalTransactionCount = 0;

        for (Map.Entry<String, Integer> entry : traderPerformance.entrySet()) {
            if (entry.getValue() > iHighestTotalTransactionCount) {
                iHighestTotalTransactionCount = entry.getValue();
                traderWithHighestTotalTransactionCount = entry.getKey();
            }
        }
        return traderWithHighestTotalTransactionCount + " got transactions number of " + String.valueOf(iHighestTotalTransactionCount);
    }

    public String findMostEfficientTrader(List<Transaction> transactions) {
        Map<String, Integer> traderPerformance = new HashMap<>();

        for (Transaction transaction : transactions) {
            traderPerformance.merge(transaction.getTrader().toString(), transaction.getValue(), (v1, v2) -> v1 + v2);
        }

        String traderWithHighestTotalTransactionValue = null;
        int iHighestTotalTransactionValue = 0;

        for (Map.Entry<String, Integer> entry : traderPerformance.entrySet()) {
            if (entry.getValue() > iHighestTotalTransactionValue) {
                iHighestTotalTransactionValue = entry.getValue();
                traderWithHighestTotalTransactionValue = entry.getKey();
            }
        }
        return traderWithHighestTotalTransactionValue + " got total trasactions value of " + String.valueOf(iHighestTotalTransactionValue);
    }

    public List<Transaction> getTransactionsWithLowestValue(List<Transaction> transactions) {
        OptionalInt iLowestTransactionValue = transactions.stream().mapToInt(Transaction::getValue).min();
        return transactions.stream().filter(t -> t.getValue() == iLowestTransactionValue.getAsInt()).collect(Collectors.toList());
    }

    public List<Transaction> getTransactionsWithHighestValue(List<Transaction> transactions) {
        OptionalInt iHighestTransactionValue = transactions.stream().mapToInt(Transaction::getValue).max();
        return transactions.stream().filter(t -> t.getValue() == iHighestTransactionValue.getAsInt()).collect(Collectors.toList());
    }

    public double getAverageFromAllTransactions(List<Transaction> transactions) {
        return transactions.stream().mapToInt(Transaction::getValue).average().getAsDouble();
    }

}