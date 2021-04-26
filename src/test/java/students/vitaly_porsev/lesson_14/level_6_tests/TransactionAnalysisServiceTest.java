package students.vitaly_porsev.lesson_14.level_6_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_14.level_6.allTasks.Transaction;
import students.vitaly_porsev.lesson_14.level_6.allTasks.TransactionAnalysisService;
import students.vitaly_porsev.lesson_14.level_6.allTasks.TransactionTestData;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

class TransactionAnalysisServiceTest {

    @Test
    void findMaxValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        Assertions.assertEquals(OptionalInt.of(1000), service.findMaxValue(data.getTransactions()));
    }

    @Test
    void findMaxEmpty() {
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<Transaction> transactions = new ArrayList<>();

        Assertions.assertEquals(OptionalInt.empty(), service.findMaxValue(transactions));
    }

    @Test
    void findMinValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        Assertions.assertEquals(OptionalInt.of(300), service.findMinValue(data.getTransactions()));
    }

    @Test
    void findMinEmpty() {
        TransactionAnalysisService service = new TransactionAnalysisService();

        List<Transaction> transactions = new ArrayList<>();

        Assertions.assertEquals(OptionalInt.empty(), service.findMinValue(transactions));
    }

    @Test
    void findAllTradersNames() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        String names = "Alan, Brian, Mario, Raoul";

        Assertions.assertEquals(names, service.findAllTradersNames(data.getTransactions()));
    }

    @Test
    void findTradersCities() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        String city = "Cambridge, Milan";

        Assertions.assertEquals(city, service.findTradersCities(data.getTransactions()));
    }
}
