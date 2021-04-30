package students.julija_katukova.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void noFraud() {
        Trader trader = new Trader("July", "Riga");
        assertFalse(fraudDetector.isFraud(trader));
    }

    @Test
    void NameFraudulent() {
        Trader trader = new Trader("Pokemon", "Riga");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void CityFraudulent() {
        Trader trader = new Trader("July", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }

    @Test
    void CityAndNameAreFraudulent() {
        Trader trader = new Trader("Pokemon", "Sidney");
        assertTrue(fraudDetector.isFraud(trader));
    }


}