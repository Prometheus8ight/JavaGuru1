package students.alex_kalashnikov.lesson_14.level_6.all_tasks;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TransactionAnalysisServiceTest {

    TransactionTestData newData = new TransactionTestData();
    List<Transaction> transactions = newData.getTransactions();

    @Test
    void getMaxValue1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(1000, victim.getMaxTransactionValue(transactions));
    }

    @Test
    void getMaxValue2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> transactions1 = Collections.emptyList();
        assertEquals(0, victim.getMaxTransactionValue(transactions1));
    }

    @Test
    void getMaxValue3() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertNotEquals(950, victim.getMaxTransactionValue(transactions));
    }

    @Test
    void getMinValue1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(300, victim.getMinTransactionValue(transactions));
    }

    @Test
    void getMinValue2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Transaction> transactions1 = Collections.emptyList();
        assertEquals(0, victim.getMinTransactionValue(transactions1));
    }

    @Test
    void getMinValue3() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertNotEquals(950, victim.getMinTransactionValue(transactions));
    }

    @Test
    void getTradersNamesSorted1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(new String("Alan,Brian,Mario,Raoul"),
                victim.getAllTradersNamesSorterByAlphabet(transactions));
    }

    @Test
    void getTradersNamesSorted2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertNotEquals(new String("Alan,Mario,Raoul,Brian"),
                victim.getAllTradersNamesSorterByAlphabet(transactions));
    }

    @Test
    void getUniqueCitiesSorted1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(new String("Cambridge,Milan"),
                victim.getUniqueCitiesSorterByAlphabet(transactions));
    }

    @Test
    void getUniqueCitiesSorted2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertNotEquals(new String("Cambridge"),
                victim.getAllTradersNamesSorterByAlphabet(transactions));
    }

}