package students.julija_katukova.lesson_14.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService victim = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    @Test
    void findTransactionsIn2011() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        Assertions.assertEquals(transactions, victim.findTransactionsInSpecificYear(transactionTestData.getTransactions(), new Transaction2011YearPredicate()));
    }

    @Test
    void findTransactionsIn2012() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));
        Assertions.assertEquals(transactions, victim.findTransactionsInSpecificYear(transactionTestData.getTransactions(), new Transaction2012YearPredicate()));
    }

    @Test
    void findTransactionsIn2013() {
        List<Transaction> transactions = Collections.emptyList();
        Assertions.assertEquals(transactions, victim.findTransactionsInSpecificYear(transactionTestData.getTransactions(), new Transaction2013YearPredicate()));
    }

    @Test
    void sortTransactionsFromSmallToBig() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000));
        Assertions.assertEquals(transactions, victim.sortTransactionsByValueFromSmallToBig(transactionTestData.getTransactions()));
    }

    @Test
    void sortTransactionsFromBigToSmall() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));
        Assertions.assertEquals(transactions, victim.sortTransactionsByValueFromBigToSmall(transactionTestData.getTransactions()));
    }

    @Test
    void sortTransactionsIn2011FromBigToSmall() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));
        Assertions.assertEquals(transactions, victim.findTransactionsInSpecificYearAndSortByValueFromSmallToBig(transactionTestData.getTransactions(), new Transaction2011YearPredicate()));
    }

}