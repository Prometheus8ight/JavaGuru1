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
        tennisGame.setPlayer1Score(1);
        tennisGame.setPlayer2Score(0);
        tennisGame.wonPoint("player1");
        Assertions.assertEquals("Thirty - Love", tennisGame.score());
    }

    @Test
    void scoreFortyLove() {
        tennisGame.setPlayer1Score(2);
        tennisGame.setPlayer2Score(0);
        tennisGame.wonPoint("player1");
        Assertions.assertEquals("Forty - Love", tennisGame.score());
    }

    @Test
    void scoreFortyFifteen() {
        tennisGame.setPlayer1Score(3);
        tennisGame.setPlayer2Score(0);
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Forty - Fifteen", tennisGame.score());
    }

    @Test
    void scoreFortyThirty() {
        tennisGame.setPlayer1Score(3);
        tennisGame.setPlayer2Score(1);
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Forty - Thirty", tennisGame.score());
    }

    @Test
    void scoreDeuce() {
        tennisGame.setPlayer1Score(3);
        tennisGame.setPlayer2Score(2);
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Deuce", tennisGame.score());
    }

    @Test
    void scoreAdvantagePlayer2() {
        tennisGame.setPlayer1Score(3);
        tennisGame.setPlayer2Score(3);
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Advantage player2", tennisGame.score());
    }

    @Test
    void scoreWinPlayer2() {
        tennisGame.setPlayer1Score(3);
        tennisGame.setPlayer2Score(4);
        tennisGame.wonPoint("player2");
        Assertions.assertEquals("Win player2", tennisGame.score());
    }

}