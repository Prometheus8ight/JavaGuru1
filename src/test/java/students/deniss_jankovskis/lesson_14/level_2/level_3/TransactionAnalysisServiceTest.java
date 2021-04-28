package students.deniss_jankovskis.lesson_14.level_2.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.deniss_jankovskis.lesson_14.level_3.Trader;
import students.deniss_jankovskis.lesson_14.level_3.Transaction;
import students.deniss_jankovskis.lesson_14.level_3.TransactionAnalysisService;
import students.deniss_jankovskis.lesson_14.level_3.TransactionTestData;

import java.util.ArrayList;
import java.util.List;

class TransactionAnalysisServiceTest {

    @Test
    void findTransactionsIn2011() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        Assertions.assertEquals(transactions, transactionAnalysisService.findTransactionsByYear(testData.getTransactions(), 2011));
    }

    @Test
    void findTransactionsIn2012() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        Assertions.assertEquals(transactions, transactionAnalysisService.findTransactionsByYear(testData.getTransactions(), 2012));
    }

    @Test
    void sortTransactionsByMinToMax() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        Assertions.assertEquals(transactions, transactionAnalysisService.sortTransactionByValueFromMinToMax(testData.getTransactions()));
    }

    @Test
    void sortTransactionsByMaxToMin() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        Assertions.assertEquals(transactions, transactionAnalysisService.sortTransactionByValueFromMaxToMin(testData.getTransactions()));
    }

    @Test
    void transactionsByYearAndSortFromMinToMax2011() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        Assertions.assertEquals(transactions, transactionAnalysisService.findTransactionsByYearAndSortFromMinToMax(testData.getTransactions(), 2011));
    }

    @Test
    void transactionsByYearAndSortFromMinToMax2012() {
        TransactionTestData testData = new TransactionTestData();
        TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        transactions.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        transactions.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        transactions.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        Assertions.assertEquals(transactions, transactionAnalysisService.findTransactionsByYearAndSortFromMinToMax(testData.getTransactions(), 2012));
    }
}
