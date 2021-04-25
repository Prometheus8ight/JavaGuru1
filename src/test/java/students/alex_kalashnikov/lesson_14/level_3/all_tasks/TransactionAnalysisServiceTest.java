package students.alex_kalashnikov.lesson_14.level_3.all_tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TransactionAnalysisServiceTest {

    TransactionTestData newData = new TransactionTestData();
    List<Transaction> transactions = newData.getTransactions();

    @Test
    void getTransactionsFor2011_1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        assertEquals(expectedResult, victim.sortByYear(transactions, 2011));
    }

    @Test
    void getAllTransactions() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950)
        );
        assertEquals(expectedResult, victim.sortByYear(transactions));
    }


    @Test
    void getTransactionsFor2011_2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        assertNotEquals(expectedResult, victim.sortByYear(transactions, 2011));
    }

    @Test
    void sortAllTransactionsByIncreasingValue() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );
        assertEquals(expectedResult, victim.sortByIncreasingValue(transactions));
    }

    @Test
    void sortAllTransactionsByDecreasingValue() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400),
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300)
        );
        assertEquals(expectedResult, victim.sortByDecreasingValue(transactions));
    }

    @Test
    void getTransactionsFor2011InIncreasingValue1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Brian", "Cambridge"), 2011, 300),
                new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400)
        );
        assertEquals(expectedResult, victim.sortByYearAndIncreasingValue(transactions, 2011));
    }

    @Test
    void getTransactionsFor2012InIncreasingValue2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> expectedResult = List.of(
                new Transaction(new Trader("Mario", "Milan"), 2012, 700),
                new Transaction(new Trader("Mario", "Milan"), 2012, 710),
                new Transaction(new Trader("Alan", "Cambridge"), 2012, 950),
                new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000)
        );
        assertEquals(expectedResult, victim.sortByYearAndIncreasingValue(transactions, 2012));
    }

}