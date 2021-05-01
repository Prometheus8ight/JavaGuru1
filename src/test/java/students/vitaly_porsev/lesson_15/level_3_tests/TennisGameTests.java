package students.vitaly_porsev.lesson_15.level_3_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_15.level_3.allTasks.Player;
import students.vitaly_porsev.lesson_15.level_3.allTasks.TennisGameImpl;

public class TennisGameTests {

    private final Player player1 = new Player("Player1");
    private final Player player2 = new Player("Player2");

    @Test
    void loveLove() {
        TennisGameImpl game = new TennisGameImpl();
        Assertions.assertEquals("Love - Love", game.score(player1, player2));
    }

    @Test
    void fifteenLove() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        Assertions.assertEquals("Fifteen - Love", game.score(player1, player2));
    }

    @Test
    void thirtyLove() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        Assertions.assertEquals("Thirty - Love", game.score(player1, player2));
    }

    @Test
    void fortyLove() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        Assertions.assertEquals("Forty - Love", game.score(player1, player2));
    }

    @Test
    void fortyFifteen() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        Assertions.assertEquals("Forty - Fifteen", game.score(player1, player2));
    }

    @Test
    void fortyThirty() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        Assertions.assertEquals("Forty - Thirty", game.score(player1, player2));
    }

    @Test
    void fortyForty() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        Assertions.assertEquals("Deuce", game.score(player1, player2));
    }

    @Test
    void advantage() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        Assertions.assertEquals("Advantage for Player2", game.score(player1, player2));
    }

    @Test
    void player2Win() {
        TennisGameImpl game = new TennisGameImpl();
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        Assertions.assertEquals("Win for Player2", game.score(player1, player2));
    }
}
