package students.julija_katukova.lesson_14.level_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Optional;


class TransactionAnalysisServiceTest {

    TransactionAnalysisService victim = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    void findMaxTransactionValue() {
        Assertions.assertEquals(Optional.of(1000), victim.findMaxTransactionValue(transactionTestData.getTransactions()));
    }

    @Test
    void findMinTransactionValue() {
        Assertions.assertEquals(Optional.of(300), victim.findMinTransactionValue(transactionTestData.getTransactions()));
    }

    @Test
    void findTradersNames() {
        Assertions.assertEquals("Alan,Brian,Mario,Raoul", victim.findTradersNamesInABC(transactionTestData.getTransactions()));
    }

    @Test
    void findTradersCities() {
        Assertions.assertEquals("Cambridge,Milan", victim.findTradersCitiesInABC(transactionTestData.getTransactions()));
    }

}