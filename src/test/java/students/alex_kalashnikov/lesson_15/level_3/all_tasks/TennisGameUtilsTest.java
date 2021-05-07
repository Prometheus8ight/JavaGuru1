package students.alex_kalashnikov.lesson_15.level_3.all_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameUtilsTest {

    TennisGame victim = new TennisGameUtils("player1", "player2");

    private void runGame(int points) {
        for (int i = 0; i < points; i++) {
            if (i % 2 == 0) {
                victim.wonPoint("player1");
            } else {
                victim.wonPoint("player2");
            }
        }
    }

    @Test
    void testScores1() {
        runGame(0);
        assertEquals("Love - Love", victim.score());
    }

    @Test
    void testScores2() {
        runGame(1);
        assertEquals("Fifteen - Love", victim.score());
    }

    @Test
    void testScores3() {
        runGame(2);
        assertEquals("Fifteen - Fifteen", victim.score());
    }

    @Test
    void testScores4() {
        runGame(3);
        assertEquals("Thirty - Fifteen", victim.score());
    }

    @Test
    void testScores5() {
        runGame(4);
        assertEquals("Thirty - Thirty", victim.score());
    }

    @Test
    void testScores6() {
        runGame(5);
        assertEquals("Forty - Thirty", victim.score());
    }

    @Test
    void testScores7() {
        runGame(6);
        assertEquals("Deuce", victim.score());
    }

    @Test
    void testScores8() {
        runGame(7);
        assertEquals("Advantage player1", victim.score());
    }

    @Test
    void testScores9() {
        runGame(8);
        assertEquals("Deuce", victim.score());
    }

    @Test
    void testScores10() {
        runGame(9);
        assertEquals("Advantage player1", victim.score());
    }

    @Test
    void testScores11() {
        runGame(9);
        victim.wonPoint("player1");
        assertEquals("Win player1", victim.score());
    }

    private void runGame1(int points) {
        for (int i = 0; i < points; i++) {
            if (i % 3 == 0) {
                victim.wonPoint("player2");
            } else {
                victim.wonPoint("player1");
            }
        }
    }

    @Test
    void testScores12() {
        runGame1(0);
        assertEquals("Love - Love", victim.score());
    }

    @Test
    void testScores13() {
        runGame1(1);
        assertEquals("Love - Fifteen", victim.score());
    }

    @Test
    void testScores14() {
        runGame1(2);
        assertEquals("Fifteen - Fifteen", victim.score());
    }

    @Test
    void testScores15() {
        runGame1(3);
        assertEquals("Thirty - Fifteen", victim.score());
    }

    @Test
    void testScores16() {
        runGame1(4);
        assertEquals("Thirty - Thirty", victim.score());
    }

    @Test
    void testScores17() {
        runGame1(5);
        assertEquals("Forty - Thirty", victim.score());
    }

    @Test
    void testScores18() {
        runGame1(6);
        assertEquals("Win player1", victim.score());
    }

    private void runGame2(int points) {
        for (int i = 0; i < points; i++) {
            victim.wonPoint("player2");
        }
    }

    @Test
    void testScores19() {
        runGame2(4);
        assertEquals("Win player2", victim.score());
    }

}