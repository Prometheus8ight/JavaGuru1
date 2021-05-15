package students.bogdans_pavlovs.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();


    @Test
    void checkIfNameFraudulentTest(){

        Trader trader = new Trader("Pokemon", "Riga");
        assertTrue(fraudDetector.isFraud(trader));
    }


    @Test
    void checkIfCityFraudulentTest(){

        Trader trader = new Trader("Not Pokemon", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }


}
