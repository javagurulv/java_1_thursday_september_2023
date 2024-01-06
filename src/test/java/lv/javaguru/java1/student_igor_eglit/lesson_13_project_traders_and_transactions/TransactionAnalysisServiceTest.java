package lv.javaguru.java1.student_igor_eglit.lesson_13_project_traders_and_transactions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    List<Transaction> transactions = TransactionTestData.getTransactions();

    @Test
    void filterByYear() {
        List<Transaction> year2011 = TransactionAnalysisService.filterByYear(transactions, 2011);
        assertEquals(4, year2011.size());

        List<Transaction> year2012 = TransactionAnalysisService.filterByYear(transactions, 2012);
        assertEquals(5, year2012.size());

        List<Transaction> year2013 = TransactionAnalysisService.filterByYear(transactions, 2013);
        assertEquals(5, year2013.size());

        List<Transaction> year2014 = TransactionAnalysisService.filterByYear(transactions, 2014);
        assertEquals(4, year2014.size());
    }

    @Test
    void sortValueAsc() {
        List<Transaction> sorted = TransactionAnalysisService.sortValueAsc(transactions);
        assertNotEquals(transactions, sorted);
        assertEquals(sorted.get(0).getValue(), 50);
        assertEquals(sorted.get(17).getValue(), 3000);
    }

    @Test
    void sortValueDsc() {
        List<Transaction> sorted = TransactionAnalysisService.sortValueDsc(transactions);
        assertNotEquals(transactions, sorted);
        assertEquals(3000, sorted.get(0).getValue());
        assertEquals(50, sorted.get(17).getValue());
    }

    @Test
    void filterAndSortAsc() {
        List<Transaction> sorted = TransactionAnalysisService.filterAndSort(transactions, 2011);
        assertEquals(2011, sorted.get(0).getYear());
        assertEquals(150, sorted.get(0).getValue());
        assertEquals(2000, sorted.get(3).getValue());
    }

    @Test
    void collectingUniqueYears() {
        List<Integer> collected = TransactionAnalysisService.collectingYears(transactions);
        assertEquals(2011, collected.get(0));
        assertEquals(2014, collected.get(3));
    }

    @Test
    void collectingUniqueNames() {
        List<String> collectedTraders = TransactionAnalysisService.collectingUniqueNames(transactions);
        assertEquals(3, collectedTraders.size());
    }

    @Test
    void collectingUniqueCities() {
        List<String> collectedTraders = TransactionAnalysisService.collectingUniqueCity(transactions);
        assertEquals(3, collectedTraders.size());
    }

    @Test
    void collectingUniqueNameFromCity() {
        List<String> collectedTraders = TransactionAnalysisService.collectingTradersNameFromCity(transactions, "Riga");
        assertEquals(1, collectedTraders.size());
    }

    @Test
    void sumTransactionVolume() {
        assertEquals(23700, TransactionAnalysisService.sumAllTransactionVolume(transactions));
    }

    @Test
    void calculateNumberOfTransactionYear2011() {
        assertEquals(4, TransactionAnalysisService.calculateNumbersOfTransactionsOfTheYear(transactions, 2011));
    }

   @Test
    void shouldFindTraderWithMostEntries() {
        assertEquals("Jonh Smith", TransactionAnalysisService.findTraderWithMostEntries(transactions));
    }
    @Test
    void shouldFindMinTransactionValue(){
assertEquals(50, TransactionAnalysisService.findMinTransactionValue(transactions));
    }
    @Test
    void shouldFindMaxTransactionValue(){
assertEquals(3000, TransactionAnalysisService.findMaxTransactionValue(transactions));
    }
    @Test
    void shouldFindAverageValue(){
assertEquals(1316, TransactionAnalysisService.findAverageValue(transactions));
    }

}