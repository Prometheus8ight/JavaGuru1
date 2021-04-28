package students.deniss_jankovskis.lesson_14.level_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class TransactionAnalysisServiceTest {

    @Test
    void findMaxValueInTransaction() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertEquals(Optional.of(1000), transactionAnalysisService.findMaxValueFromAllTransactions(testData.getTransactions()));
    }

    @Test
    void findMinValueInTransaction() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertEquals(Optional.of(300), transactionAnalysisService.findMinValueFromAllTransactions(testData.getTransactions()));
    }

    @Test
    void findNamesInABCOrder() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertEquals("Alan,Brian,Mario,Raoul", transactionAnalysisService.findAllNamesInAlphabetOrder(testData.getTransactions()));
    }

    @Test
    void findCitiesInABCOrder() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        Assertions.assertEquals("Cambridge,Milan", transactionAnalysisService.findAllCitiesInAlphabetOrder(testData.getTransactions()));
    }
}
