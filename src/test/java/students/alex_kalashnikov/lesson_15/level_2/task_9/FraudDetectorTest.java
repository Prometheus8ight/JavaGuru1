package students.alex_kalashnikov.lesson_15.level_2.task_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class FraudDetectorTest {

    FraudDetector victim = new FraudDetector();

    @Test
    void isFraudByNickname() {
        assertEquals(true, victim.isFraud(new Trader(
                "Pokemon",
                "Vasya Pupkin",
                "Riga")));
    }

    @Test
    void isFraudByCity() {
        assertEquals(true, victim.isFraud(new Trader(
                "Vasya1234",
                "Vasya Pupkin",
                "Sidney")));
    }

    @Test
    void isFraudByNicknameAndCity1() {
        assertEquals(true, victim.isFraud(new Trader(
                "Pokemon",
                "Vasya Pupkin",
                "Sidney")));
    }

    @Test
    void isFraudByNicknameAndCity2() {
        assertNotEquals(false, victim.isFraud(new Trader(
                "Pokemon",
                "Vasya Pupkin",
                "Sidney")));
    }

    @Test
    void noFraud() {
        assertEquals(false, victim.isFraud(new Trader(
                "Vasya1234",
                "Vasya Pupkin",
                "Riga")));
    }

}