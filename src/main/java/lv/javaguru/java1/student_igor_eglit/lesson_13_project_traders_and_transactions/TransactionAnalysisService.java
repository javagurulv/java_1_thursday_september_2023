package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

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
                map(transaction -> transaction.getTrader()).
                map(trader -> trader.getName()).
                distinct().collect(Collectors.toList());
    }

    static List<String> collectingUniqueCity(List<Transaction> transactions) {
        return transactions.stream().
                map(transaction -> transaction.getTrader()).
                map(trader -> trader.getCity()).
                distinct().collect(Collectors.toList());
    }

    static List<String> collectingTradersNameFromCity(List<Transaction> transactions, String city) {
        return transactions.stream().
                filter(transaction -> transaction.getTrader().getCity().equals(city)).
                map(transaction -> transaction.getTrader()).
                map(trader -> trader.getName()).
                distinct().collect(Collectors.toList());
    }

    static int sumAllTransactionVolume(List<Transaction> transactions) {
        return transactions.stream().
                mapToInt(transaction -> transaction.getValue()).sum();

    }

    static long calculateNumbersOfTransactionsOfTheYear(List<Transaction> transactions, int transactionYear) {
        return transactions.stream().
                filter(year -> year.getYear() == transactionYear).count();
    }

//ТРЕЙДЕР С БОЛЬШИМ КОЛИЧЕСТВОМ ВХОЖДЕНИЙ - способ циклов и способ СТРИМ АПИ
    static String findTraderWithMostEntriesOldSchool(List<Transaction> transactions) {
        HashSet<String> temp = new HashSet<>();//сэт примет только уникальные имена, временный сэт
        Map<Integer, String> entryCounter = new TreeMap<>();//сюда сложим уникальные имена и сколько раз определенное имя встречалось в таблице,
        //сортируем одновременно от больших вхождений в таблицу
        for (Transaction transaction : transactions) {//собираем уникальные
            temp.add(transaction.getTrader().getName());
        }
        var tempArray = temp.toArray();//массив уникальных типа стринг

        for (int indexSet = 0; indexSet < tempArray.length; indexSet++) {//посчитаем на каждый стринг массива вхождения в таблицу

            int counter = 0;
            for (Transaction transaction : transactions) {
                if (transaction.getTrader().getName().equals(tempArray[indexSet])) {
                    counter++;
                }
            }
            entryCounter.put(counter, (String) tempArray[indexSet]);//сложим в новый трисэт ключи=счетчик и соотвественное имя
        }
        Iterator<Map.Entry<Integer, String>> it = entryCounter.entrySet().iterator();//проитеррируем трисет
        Map.Entry<Integer, String> first = null;
        for (int ind = 0; ind < entryCounter.size(); ind++) {
            first = it.next();
        }
        return first.getValue();//вывод имени с большим вхождением в таблицу.
    }

    static String findTraderWithMostEntries(List<Transaction> transactions) {
        Map<String, Long> traderEntryCount = transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.getTrader().getName(),
                        Collectors.counting()));
        String traderWithMostEntries = traderEntryCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("");
        return traderWithMostEntries;
    }







    static int findMinTransactionValue(List<Transaction> transactions) {
        return transactions.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue();
    }

    static int findMaxTransactionValue(List<Transaction> transactions) {
        return transactions.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue();
    }
    static int findAverageValue(List<Transaction> transactions) {
        int size = transactions.size();
        return transactions.stream().
                mapToInt(transaction -> transaction.getValue()).sum() /size;
    }


    public static void printTransactions(List<Transaction> transactions) {
        transactions.forEach(System.out::println);
    }
}
