package students.alex_kalashnikov.lesson_14.level_4.all_tasks;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TransactionAnalysisServiceTest {

    TransactionTestData newData = new TransactionTestData();
    List<Transaction> transactions = newData.getTransactions();

    @Test
    void yearsOfAllTransactions1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Integer> expectedResult = List.of(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expectedResult, victim.getYearsOfAllTransactions(transactions));
    }

    @Test
    void yearsOfAllTransactions2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        List<Integer> expectedResult = List.of(2011, 2012, 2011, 2012);
        assertNotEquals(expectedResult, victim.getYearsOfAllTransactions(transactions));
    }

    @Test
    void uniqueYearsOfAllTransactions1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<Integer> expectedResult = Set.of(2011, 2012);
        assertEquals(expectedResult, victim.getUniqueYearsOfAllTransactions(transactions));
    }

    @Test
    void uniqueYearsOfAllTransactions2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<Integer> expectedResult = Set.of(2011, 2012, 2010);
        assertNotEquals(expectedResult, victim.getUniqueYearsOfAllTransactions(transactions));
    }

    @Test
    void uniqueTradersNames1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of("Raoul", "Mario", "Alan", "Brian");
        assertEquals(expectedResult, victim.getAllTradersNames(transactions));
    }

    @Test
    void uniqueTradersNames2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of("Raoul", "Mario", "Brian");
        assertNotEquals(expectedResult, victim.getAllTradersNames(transactions));
    }

    @Test
    void uniqueTradersCities1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of("Cambridge", "Milan");
        assertEquals(expectedResult, victim.getAllTradersCities(transactions));
    }

    @Test
    void uniqueTradersCities2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of("Cambridge", "Milan", "Riga");
        assertNotEquals(expectedResult, victim.getAllTradersCities(transactions));
    }

    @Test
    void TradersNamesFromCity1() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of("Raoul", "Alan", "Brian");
        assertEquals(expectedResult, victim.getAllTradersNamesFromCity(transactions, "Cambridge"));
    }

    @Test
    void TradersNamesFromCity2() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of();
        assertEquals(expectedResult, victim.getAllTradersNamesFromCity(transactions, "Riga"));
    }

    @Test
    void TradersNamesFromCity3() {
        TransactionAnalysisService victim = new TransactionAnalysisService();
        Set<String> expectedResult = Set.of("Raoul", "Alan", "Brian", "Mario");
        assertNotEquals(expectedResult, victim.getAllTradersNamesFromCity(transactions, "Cambridge"));
    }

}