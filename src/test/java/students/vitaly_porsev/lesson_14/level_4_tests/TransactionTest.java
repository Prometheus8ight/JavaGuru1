package students.vitaly_porsev.lesson_14.level_4_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_14.level_4.allTasks.TransactionAnalysisService;
import students.vitaly_porsev.lesson_14.level_4.allTasks.TransactionTestData;

import java.util.ArrayList;
import java.util.List;

public class TransactionTest {

    @Test
    void findYearsOfTransactions() {
        TransactionAnalysisService transaction = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2011);
        integerList.add(2012);
        integerList.add(2011);
        integerList.add(2012);
        integerList.add(2012);
        integerList.add(2012);

        Assertions.assertEquals(integerList, transaction.findAllTransactionsYears(data.getTransactions()));
    }

    @Test
    void findUniqueYearsOfTransactions() {
        TransactionAnalysisService transaction = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2011);
        integerList.add(2012);

        Assertions.assertEquals(integerList, transaction.findUniqueTransactionsYears(data.getTransactions()));
    }

    @Test
    void findUniqueNamesOfTransactions() {
        TransactionAnalysisService transaction = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<String> stringList = new ArrayList<>();
        stringList.add("Brian");
        stringList.add("Raoul");
        stringList.add("Mario");
        stringList.add("Alan");

        Assertions.assertEquals(stringList, transaction.findUniqueTransactionsNames(data.getTransactions()));
    }

    @Test
    void findUniqueCitiesOfTransactions() {
        TransactionAnalysisService transaction = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<String> stringList = new ArrayList<>();
        stringList.add("Cambridge");
        stringList.add("Milan");

        Assertions.assertEquals(stringList, transaction.findUniqueTransactionsCities(data.getTransactions()));
    }

    @Test
    void findUniqueTransactionsNamesOfTheCambridge() {
        TransactionAnalysisService transaction = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<String> stringList = new ArrayList<>();
        stringList.add("Brian");
        stringList.add("Raoul");
        stringList.add("Alan");

        Assertions.assertEquals(stringList, transaction.findTraderNamesFromCity(data.getTransactions(), "Cambridge"));
    }

    @Test
    void findUniqueTransactionsNamesOfTheMilan() {
        TransactionAnalysisService transaction = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<String> stringList = new ArrayList<>();
        stringList.add("Mario");

        Assertions.assertEquals(stringList, transaction.findTraderNamesFromCity(data.getTransactions(), "Milan"));
    }
}
