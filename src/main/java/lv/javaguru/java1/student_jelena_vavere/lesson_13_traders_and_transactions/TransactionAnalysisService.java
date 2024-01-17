package lv.javaguru.java1.student_jelena_vavere.lesson_13_traders_and_transactions;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> findTransactionYear2011(List<Transaction> transactions) {
        List<Transaction> transactions2011 = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getYear() == 2011) {
                transactions2011.add(transaction);
            }
        }
        return transactions2011;
    }

    List<Transaction> findTransactionYear2011(List<Transaction> transactions,
                                              int year) {
        List<Transaction> transactions2011 = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getYear() == year) {
                transactions2011.add(transaction);
            }
        }
        return transactions2011;
    }
    public List<Transaction> findAllTransactionsMadeIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction>transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortByYearsASC(List<Transaction>transactions) {

        return transactions.stream()
                .sorted(new Comparator<Transaction>() {
                    @Override
                    public int compare(Transaction t1, Transaction t2) {
                        // if (t1.getValue() == t2.get.Value()) return 0; это то как в comporator записаны действия
                        // if (t1.getValue() < t2.get.Value()) return -1;
                        // else return 1;


                        return Integer.compare(t1.getValue(), t2.getValue() ); //это тоже самое только записано в одну строчку
                    }
                })
                .collect(Collectors.toList());

        /* return transactions.stream()
                .sorted((t1, t2) - > Integer.compare(t1.getValue(), t2.getValue))
        .collect(Collectors.toList());

        */

    }
    public List<Transaction> sortByYearsDESC(List<Transaction> transactions) {
       return transactions.stream()
               .sorted((t1, t2) -> -1 * Integer.compare(t1.getValue(), t2.getValue()))
               .collect(Collectors.toList());
    }

    public List<Transaction> findAllTransactionsMadeIn2011SortedByAsc(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
                .collect(Collectors.toList());
    }

    public List<Integer> findAllTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(Collectors.toList());
    }

    public Set<Integer> findUniqueYearsSet(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(Collectors.toSet());
    }

    public List<Integer> findUniqueYearsList(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTraderNamesList(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .distinct()
                .collect(Collectors.toList());
    }

    public Set<String> findUniqueTraderNamesSet(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .collect(Collectors.toSet());
    }

    public List<String> findUniqueTraderCitiesList(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findUniqueTraderNamesListSortedAsc(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
