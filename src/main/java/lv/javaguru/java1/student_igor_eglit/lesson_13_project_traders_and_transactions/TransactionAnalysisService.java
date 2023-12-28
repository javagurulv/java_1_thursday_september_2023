package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    static List<Transaction> filterByYear(List<Transaction> transactions) {
        return transactions.stream().
                filter(year -> year.getYear() == 2011)
                .collect(Collectors.toList());
    }
    public static void printTransactions(List<Transaction> transactions){
        transactions.forEach(System.out::println);
    }
}
