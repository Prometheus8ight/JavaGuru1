package students.vitaly_porsev.lesson_14.level_5_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_14.level_5.allTasks.TransactionAnalysisService;
import students.vitaly_porsev.lesson_14.level_5.allTasks.TransactionTestData;

class TransactionAnalysisServiceTest {

    @Test
    void findCityMilan() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        Assertions.assertTrue(service.findTraderOfTheCity(data.getTransactions(), "Milan"));
    }

    @Test
    void findCityCambridge() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        Assertions.assertTrue(service.findTraderOfTheCity(data.getTransactions(), "Cambridge"));
    }

    @Test
    void findCityFalse() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        Assertions.assertFalse(service.findTraderOfTheCity(data.getTransactions(), "Moscow"));
    }
}
