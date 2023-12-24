package lv.javaguru.java1.teacher.lesson_13_project_traders_and_transactions.step_4.transactionanalysis;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}