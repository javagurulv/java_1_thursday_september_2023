package lv.javaguru.java1.teacher.lesson_13_project_traders_and_transactions.step_12.transactionanalysis;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    private TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    public void shouldFindAllTransactionsMadeIn2011() {
        List<Transaction> transactions = service.findAllTransactionsMadeIn2011(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 2);
    }


    @Test
    public void shouldFindTransactionsByYear() {
        List<Transaction> transactions2011 = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2011
        );
        assertEquals(transactions2011.size(), 2);

        List<Transaction> transactions2012 = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2012
        );
        assertEquals(transactions2012.size(), 4);

        List<Transaction> transactions2013 = service.findTransactionsByYear(
                TransactionTestData.getTransactions(), 2013
        );
        assertEquals(transactions2013.size(), 0);
    }

    @Test
    public void shouldSortTransactionsByValueASC() {
        List<Transaction> transactions = service.sortTransactionsByValueASC(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 6);
        assertEquals(transactions.get(0).getValue(), 300);
        assertEquals(transactions.get(1).getValue(), 400);
        assertEquals(transactions.get(2).getValue(), 700);
        assertEquals(transactions.get(3).getValue(), 710);
        assertEquals(transactions.get(4).getValue(), 950);
        assertEquals(transactions.get(5).getValue(), 1000);
    }

    @Test
    public void shouldSortTransactionsByValueDESC() {
        List<Transaction> transactions = service.sortTransactionsByValueDesc(
                TransactionTestData.getTransactions()
        );
        assertEquals(transactions.size(), 6);
        assertEquals(transactions.get(0).getValue(), 1000);
        assertEquals(transactions.get(1).getValue(), 950);
        assertEquals(transactions.get(2).getValue(), 710);
        assertEquals(transactions.get(3).getValue(), 700);
        assertEquals(transactions.get(4).getValue(), 400);
        assertEquals(transactions.get(5).getValue(), 300);
    }

    @Test
    public void shouldFindTransactionsByYearAndSortByValueASC() {
        List<Transaction> transactions = service.findTransactionsByYearAndSortByValueASC(
                TransactionTestData.getTransactions(), 2012
        );
        assertEquals(transactions.size(), 4);
        assertEquals(transactions.get(0).getValue(), 700);
        assertEquals(transactions.get(1).getValue(), 710);
        assertEquals(transactions.get(2).getValue(), 950);
        assertEquals(transactions.get(3).getValue(), 1000);
    }

    @Test
    public void shouldFindTransactionYears() {
        List<Integer> years = service.findTransactionYears(
                TransactionTestData.getTransactions()
        );
        assertEquals(years.size(), 6);
        assertTrue(years.contains(2011));
        assertTrue(years.contains(2012));
        assertFalse(years.contains(2013));
        assertFalse(years.contains(2010));
    }

    @Test
    public void shouldFindUniqueTransactionYears() {
        Set<Integer> years = service.findUniqueTransactionYears(
                TransactionTestData.getTransactions()
        );
        assertEquals(years.size(), 2);
        assertTrue(years.contains(2011));
        assertTrue(years.contains(2012));
    }

    @Test
    public void shouldFindUniqueTraderNames() {
        Set<String> traderNames = service.findUniqueTraderNames(
                TransactionTestData.getTransactions()
        );
        assertEquals(traderNames.size(), 4);
        assertTrue(traderNames.contains("Raoul"));
        assertTrue(traderNames.contains("Mario"));
        assertTrue(traderNames.contains("Alan"));
        assertTrue(traderNames.contains("Brian"));
    }

    @Test
    public void shouldFindUniqueTraderCities() {
        Set<String> traderCities = service.findUniqueTraderCities(
                TransactionTestData.getTransactions()
        );
        assertEquals(traderCities.size(), 2);
        assertTrue(traderCities.contains("Cambridge"));
        assertTrue(traderCities.contains("Milan"));
    }

    @Test
    public void shouldFindUniqueTraderNamesFromCambridge() {
        Set<String> traderNames = service.findUniqueTraderNamesFromCambridge(
                TransactionTestData.getTransactions()
        );
        assertEquals(traderNames.size(), 3);
        assertTrue(traderNames.contains("Raoul"));
        assertTrue(traderNames.contains("Alan"));
        assertTrue(traderNames.contains("Brian"));
    }

}