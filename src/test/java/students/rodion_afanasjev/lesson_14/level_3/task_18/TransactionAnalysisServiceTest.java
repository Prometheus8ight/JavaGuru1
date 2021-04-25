package students.rodion_afanasjev.lesson_14.level_3.task_18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService test = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario","Milan");
    Trader alan = new Trader("Alan","Cambridge");
    Trader brian = new Trader("Brian","Cambridge");

    @Test
    public void findByYear2011(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2011,400));

        Assertions.assertEquals(transactions, test.findByYear(transactionTestData.getTransactions(), 2011));
    }

    @Test
    public void findByYear2012(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        Assertions.assertEquals(transactions, test.findByYear(transactionTestData.getTransactions(), 2012));
    }

    @Test
    public void sortMinToMaxValue(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000));

        Assertions.assertEquals(transactions, test.sortFromMinToMaxValue(transactionTestData.getTransactions()));
    }

    @Test
    public void sortMaxToMinValue(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300));

        Assertions.assertEquals(transactions, test.sortFromMaxToMinValue(transactionTestData.getTransactions()));
    }

    @Test
    public void findAndSortMinMax(){
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400));

        Assertions.assertEquals(transactions, test.findAndSortYear2011TransactionFromMinToMax(transactionTestData.getTransactions(),2011));
    }

}