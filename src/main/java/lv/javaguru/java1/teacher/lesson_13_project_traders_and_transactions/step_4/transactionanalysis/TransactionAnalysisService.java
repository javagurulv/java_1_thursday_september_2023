package lv.javaguru.java1.teacher.lesson_13_project_traders_and_transactions.step_4.transactionanalysis;

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


}
