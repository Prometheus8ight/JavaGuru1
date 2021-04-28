package students.deniss_jankovskis.lesson_14.level_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransactionAnalysisServiceTest {

    @Test
    void findTrueCambridgeCity() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertTrue(transactionAnalysisService.isAnyTraderBasedInCity(testData.getTransactions(), "Cambridge"));
    }

    @Test
    void findTrueMilanCity() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertTrue(transactionAnalysisService.isAnyTraderBasedInCity(testData.getTransactions(), "Milan"));
    }

    @Test
    void findFalseCityLondon() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertFalse(transactionAnalysisService.isAnyTraderBasedInCity(testData.getTransactions(), "London"));
    }

    @Test
    void findFalseCityRiga() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertFalse(transactionAnalysisService.isAnyTraderBasedInCity(testData.getTransactions(), "Riga"));
    }
}
