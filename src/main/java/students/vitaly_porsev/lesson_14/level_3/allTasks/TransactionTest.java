package students.vitaly_porsev.lesson_14.level_3.allTasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TransactionTest {

    @Test
    void findTransactionBy2011() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));

        Assertions.assertEquals(transactions, service.findTransactionsByYear(data.getTransactions(), 2011));
    }

    @Test
    void findTransactionBy2012() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));

        Assertions.assertEquals(transactions, service.findTransactionsByYear(data.getTransactions(), 2012));
    }

    @Test
    void findTransactionBy2013() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();

        Assertions.assertEquals(transactions, service.findTransactionsByYear(data.getTransactions(), 2013));
    }

    @Test
    void sortTestMinToMax() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));

        Assertions.assertEquals(transactions, service.sortByValueFromMinToMax(data.getTransactions()));
    }

    @Test
    void sortTestMaxToMin() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));

        Assertions.assertEquals(transactions, service.sortByValueFromMaxToMin(data.getTransactions()));
    }

    @Test
    void FindByYearAndsSortMinToMax2011() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));

        Assertions.assertEquals(transactions, service.findTransactionsByYearAndSortFromMinToMax(data.getTransactions(), 2011));
    }

    @Test
    void FindByYearAndsSortMinToMax2012() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));

        Assertions.assertEquals(transactions, service.findTransactionsByYearAndSortFromMinToMax(data.getTransactions(), 2012));
    }
}
