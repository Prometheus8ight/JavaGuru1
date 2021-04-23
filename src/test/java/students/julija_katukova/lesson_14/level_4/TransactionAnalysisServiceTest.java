package students.julija_katukova.lesson_14.level_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {

    TransactionAnalysisService victim = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    void findAllTransactionYears() {
        List<Integer> years = new ArrayList<>();
        years.add(2011);
        years.add(2012);
        years.add(2011);
        years.add(2012);
        years.add(2012);
        years.add(2012);
        Assertions.assertEquals(years, victim.findAllTransactionYears(transactionTestData.getTransactions()));
    }

    @Test
    void findTransactionYears() {
        Set<Integer> years = new HashSet<>();
        years.add(2011);
        years.add(2012);
        Assertions.assertEquals(years, victim.findTransactionYears(transactionTestData.getTransactions()));
    }

    @Test
    void findTraderNames() {
        Set<String> names = new HashSet<>();
        names.add("Brian");
        names.add("Raoul");
        names.add("Alan");
        names.add("Mario");
        Assertions.assertEquals(names, victim.findTradersNames(transactionTestData.getTransactions()));
    }

    @Test
    void findTraderCities() {
        Set<String> cities = new HashSet<>();
        cities.add("Cambridge");
        cities.add("Milan");
        Assertions.assertEquals(cities, victim.findTradersCities(transactionTestData.getTransactions()));
    }

    @Test
    void findTradersFromSpecificCity1() {
        Set<String> names = new HashSet<>();
        names.add("Brian");
        names.add("Raoul");
        names.add("Alan");
        Assertions.assertEquals(names, victim.findTradersFromSpecificCity(transactionTestData.getTransactions(), "Cambridge"));
    }

    @Test
    void findTradersFromSpecificCity2() {
        Set<String> names = new HashSet<>();
        names.add("Mario");
        Assertions.assertEquals(names, victim.findTradersFromSpecificCity(transactionTestData.getTransactions(), "Milan"));
    }

    @Test
    void findTradersFromSpecificCity3() {
        Set<String> names = new HashSet<>();
        Assertions.assertEquals(names, victim.findTradersFromSpecificCity(transactionTestData.getTransactions(), "London"));
    }
}