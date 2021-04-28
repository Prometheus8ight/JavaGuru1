package students.deniss_jankovskis.lesson_14.level_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TransactionAnalysisServiceTest {

    @Test
    void findTransactionsYears() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Integer> integers = new ArrayList<>();
        integers.add(2011);
        integers.add(2012);
        integers.add(2011);
        integers.add(2012);
        integers.add(2012);
        integers.add(2012);
        Assertions.assertEquals(integers, transactionAnalysisService.findAllTransactionsYears(testData.getTransactions()));
    }

    @Test
    void findUniqueTransactions() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Integer> integers = new ArrayList<>();
        integers.add(2011);
        integers.add(2012);
        Assertions.assertEquals(integers, transactionAnalysisService.findAllUniqueTransactions(testData.getTransactions()));
    }

    @Test
    void findTransactionByName() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> strings = new ArrayList<>();
        strings.add("Brian");
        strings.add("Raoul");
        strings.add("Mario");
        strings.add("Alan");
        Assertions.assertEquals(strings, transactionAnalysisService.findTransactionNames(testData.getTransactions()));
    }

    @Test
    void findTransactionByCity() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> strings = new ArrayList<>();
        strings.add("Cambridge");
        strings.add("Milan");
        Assertions.assertEquals(strings, transactionAnalysisService.findTransactionCities(testData.getTransactions()));
    }

    @Test
    void findTraderName() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<String> strings = new ArrayList<>();
        strings.add("Brian");
        strings.add("Raoul");
        strings.add("Alan");
        Assertions.assertEquals(strings, transactionAnalysisService.findTraderNamesFromCity(testData.getTransactions(), "Cambridge"));
    }


}
