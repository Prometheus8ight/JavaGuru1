package students.deniss_jankovskis.lesson_15.task_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.deniss_jankovskis.lesson_15.level_2.task_9.FraudDetector;
import students.deniss_jankovskis.lesson_15.level_2.task_9.Trader;

class FraudDetectorTest {

    @Test
    void fraudName() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "London");
        Assertions.assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void fraudCity() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Anonymous", "Sidney");
        Assertions.assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void falseTrader() {
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Gena", "Magnitogorsk");
        Assertions.assertFalse(fraudDetector.isFraud(trader));
    }
}
