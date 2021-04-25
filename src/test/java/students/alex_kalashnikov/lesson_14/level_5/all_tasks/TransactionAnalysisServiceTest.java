package students.alex_kalashnikov.lesson_14.level_5.all_tasks;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionAnalysisServiceTest {

    TransactionTestData newData = new TransactionTestData();
    List<Transaction> transactions = newData.getTransactions();

    @Test
    void IsAnyTraderFromMilan() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(true, victim.isAnyTraderFromCity(transactions, "Milan"));
    }

    @Test
    void IsAnyTraderFromCambridge() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(true, victim.isAnyTraderFromCity(transactions, "Cambridge"));
    }

    @Test
    void IsAnyTraderFromRiga() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        assertEquals(false, victim.isAnyTraderFromCity(transactions, "Riga"));
    }

}