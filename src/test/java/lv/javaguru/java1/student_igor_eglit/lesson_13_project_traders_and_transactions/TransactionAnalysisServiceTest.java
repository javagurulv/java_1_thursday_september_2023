package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    List<Transaction> transactions = TransactionTestData.getTransactions();

    @Test
    void filterByYear(){
        List<Transaction> year = TransactionAnalysisService.filterByYear(transactions);
        assertEquals(4, year.size());
    }

}