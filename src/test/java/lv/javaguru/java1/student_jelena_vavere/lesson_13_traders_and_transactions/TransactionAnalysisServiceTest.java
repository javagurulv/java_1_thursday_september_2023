package lv.javaguru.java1.student_jelena_vavere.lesson_13_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    private  TransactionAnalysisService service = new TransactionAnalysisService();
    @Test
    public void shouldFindAllTransactionsMadeIn2011() {
        List<Transaction> transactions = service.findTransactionYear2011(
                TransactionTestData.getTransactions(), 2011);
    assertEquals(transactions.size(), 2);
    }

    @Test
    public void shouldFindAllTransactionsMadeIn2012() {
        List<Transaction> transactions = service.findTransactionYear2011(
                TransactionTestData.getTransactions(), 2012);
        assertEquals(transactions.size(), 4);
    }

    @Test
    public void shouldSortAsc() {
        List<Transaction> transactions = service.sortByYearsASC(
                TransactionTestData.getTransactions());
        assertEquals(transactions.get(0).getValue(), 300);
        assertEquals(transactions.get(5).getValue(), 1000);
    }

    @Test
    public void shouldSortDesc() {
        List<Transaction> transactions = service.sortByYearsDESC(
                TransactionTestData.getTransactions());
        assertEquals(transactions.get(0).getValue(), 1000);
        assertEquals(transactions.get(5).getValue(), 300);
    }

    @Test
    public void shouldFindYear() {
        List<Integer> years = service.findAllTransactionsYears(
                TransactionTestData.getTransactions());
        assertEquals(years.size(), 6);
        assertEquals(years.get(0), 2011);
        assertEquals(years.get(5), 2012);
    }

    @Test
    public void shouldFindUniqueYearSet() {
        Set<Integer> years = service.findUniqueYearsSet(
                TransactionTestData.getTransactions());
        assertEquals(years.size(), 2);
        assertTrue(years.contains(2011));
        assertTrue(years.contains(2012));
    }

    @Test
    public void shouldFindUniqueYearList() {
        List<Integer> years = service.findUniqueYearsList(
                TransactionTestData.getTransactions());
        assertEquals(years.size(), 2);
        assertTrue(years.contains(2011));
        assertTrue(years.contains(2012));
    }

}