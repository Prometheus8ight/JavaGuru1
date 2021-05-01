package students.rodion_afanasjev.lesson_14.level_4.task_25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService test = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    public void findAllYears(){
        List<Integer> years = new ArrayList<>();
                years.add(2011);
                years.add(2012);
                years.add(2011);
                years.add(2012);
                years.add(2012);
                years.add(2012);

        Assertions.assertEquals(years, test.findAllTransactionYears(transactionTestData.getTransactions()));
    }

    @Test
    public void findOnlyYear(){
        Set<Integer> years = new HashSet<>();
        years.add(2011);
        years.add(2012);

        Assertions.assertEquals(years, test.findTransactionYears(transactionTestData.getTransactions()));
    }

    @Test
    public void findTraderName(){
        Set<String> names = new HashSet<>();
        names.add("Raoul");
        names.add("Mario");
        names.add("Alan");
        names.add("Brian");

        Assertions.assertEquals(names, test.findTransactionTraderName(transactionTestData.getTransactions()));
    }

    @Test
    public void findTraderCity(){
        Set<String> city = new HashSet<>();
        city.add("Cambridge");
        city.add("Milan");

        Assertions.assertEquals(city, test.findTransactionTraderCity(transactionTestData.getTransactions()));
    }

    @Test
    public void findTraderFromSpecificCity(){
        Set<String> names = new HashSet<>();
        names.add("Raoul");
        names.add("Alan");
        names.add("Brian");

        Assertions.assertEquals(names, test.findTransactionTraderFromCamp(transactionTestData.getTransactions(),"Cambridge"));
    }

    @Test
    public void checkTraderFromMilan(){
        assertTrue(test.ifTradersFromMilan(transactionTestData.getTransactions(),"Milan"));
    }

    @Test
    public void checkTraderFromLondon(){
        assertFalse(test.ifTradersFromMilan(transactionTestData.getTransactions(), "London"));
    }

    @Test
    public void findMax(){
        Assertions.assertEquals(Optional.of(1000), test.findMaxTransactionValue(transactionTestData.getTransactions()));
    }

    @Test
    public void findMin(){
        Assertions.assertEquals(Optional.of(300), test.findMinTransactionValue(transactionTestData.getTransactions()));
    }

    @Test
    public void findAndSortNames(){
        Assertions.assertEquals("Alan,Brian,Mario,Raoul", test.findAndSortTradersName(transactionTestData.getTransactions()));
    }

    @Test
    public void findAndSortCities(){
        Assertions.assertEquals("Cambridge,Milan", test.findAndSortTraderCities(transactionTestData.getTransactions()));
    }

}