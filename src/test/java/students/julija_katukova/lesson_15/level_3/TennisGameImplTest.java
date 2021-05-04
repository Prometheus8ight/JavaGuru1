package students.julija_katukova.lesson_15.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisGameImplTest {

    TennisGameImpl tennisGame = new TennisGameImpl();

    @Test
    void scoreLoveLove() {
        Assertions.assertEquals("Love - Love", tennisGame.score());
    }

    @Test
    void scoreFifteenLove() {
        tennisGame.wonPoint("player1");
        Assertions.assertEquals("Fifteen - Love", tennisGame.score());
    }

    @Test
    void scoreThirtyLove() {
        tennisGame.setGameScore("Fifteen - Love");
        tennisGame.wonPoint("player1");
        Assertions.assertEquals("Thirty - Love", tennisGame.score());
    }

    @Test
    void scoreFortyLove() {
        tennisGame.setGameScore("Thirty - Love");
        tennisGame.wonPoint("player1");
        Assertions.assertEquals("Forty - Love", tennisGame.score());
    }

    @Test
    void scoreFortyFifteen() {
        tennisGame.setGameScore("Forty - Love");
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Forty - Fifteen", tennisGame.score());
    }

    @Test
    void scoreFortyThirty() {
        tennisGame.setGameScore("Forty - Fifteen");
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Forty - Thirty", tennisGame.score());
    }

    @Test
    void scoreDeuce() {
        tennisGame.setGameScore("Forty - Thirty");
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Deuce", tennisGame.score());
    }

    @Test
    void scoreAdvantagePlayer2() {
        tennisGame.setGameScore("Deuce");
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Advantage player2", tennisGame.score());
    }

    @Test
    void scoreWinPlayer2() {
        tennisGame.setGameScore("Advantage player2");
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Win player2", tennisGame.score());
    }

}