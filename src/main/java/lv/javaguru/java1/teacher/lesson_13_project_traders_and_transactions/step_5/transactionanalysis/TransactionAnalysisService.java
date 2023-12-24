package lv.javaguru.java1.teacher.lesson_13_project_traders_and_transactions.step_5.transactionanalysis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public List<Transaction> findAllTransactionsMadeIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());
    }

    public List<Transaction> findAllTransactionsMadeIn2012(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2012)
                .collect(Collectors.toList());
    }

    public List<Transaction> findAllTransactionsMadeIn2013(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2013)
                .collect(Collectors.toList());
    }


    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValueASC(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }



}
