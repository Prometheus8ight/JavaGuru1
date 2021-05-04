package students.rodion_afanasjev.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FraudDetectorTest {

    @Test
    public void isFraudTest(){
        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon","Sidney");

        Assertions.assertTrue(fraudDetector.isFraud(trader));
    }



}