package students.julija_katukova.lesson_14.level_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService victim = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    void isAntTraderFromMilan() {
        assertTrue(victim.isAntTraderFromSpecificCity(transactionTestData.getTransactions(), "Milan"));
    }

    @Test
    void isAntTraderFromCambridge() {
        assertTrue(victim.isAntTraderFromSpecificCity(transactionTestData.getTransactions(), "Cambridge"));
    }

    @Test
    void isAntTraderFromLondon() {
        assertFalse(victim.isAntTraderFromSpecificCity(transactionTestData.getTransactions(), "London"));
    }
}