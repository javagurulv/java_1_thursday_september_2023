package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    List<Transaction> transactions = TransactionTestData.getTransactions();

    @Test
    void filterByYear(){
        List<Transaction> year2011 = TransactionAnalysisService.filterByYear(transactions, 2011);
        assertEquals(4, year2011.size());

        List<Transaction> year2012 = TransactionAnalysisService.filterByYear(transactions, 2012);
        assertEquals(5, year2012.size());

        List<Transaction> year2013 = TransactionAnalysisService.filterByYear(transactions, 2013);
        assertEquals(5, year2013.size());

        List<Transaction> year2014 = TransactionAnalysisService.filterByYear(transactions, 2014);
        assertEquals(4, year2014.size());
    }

}