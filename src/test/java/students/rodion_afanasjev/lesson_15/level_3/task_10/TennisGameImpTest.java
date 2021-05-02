package students.rodion_afanasjev.lesson_15.level_3.task_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TennisGameImpTest {

    static TennisGame game = new TennisGameImp();
    Player player1 = new Player("Roma");
    Player player2 = new Player("Vasya");

    @Test
    public void loveAllTest(){
        Assertions.assertEquals("Love - Love", game.score(player1, player2));
    }

    @Test
    public void fifteenAllTest(){
        game.wonPoint(player1);
        game.wonPoint(player2);

        Assertions.assertEquals("Fifteen - Fifteen", game.score(player1, player2));
    }

    @Test
    public void thirtyAllTest(){
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);

        Assertions.assertEquals("Thirty - Thirty", game.score(player1, player2));
    }

    @Test
    public void fortyAllTest(){
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);

        Assertions.assertEquals("Deuce", game.score(player1, player2));
    }

    @Test
    public void winTest(){
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);

        Assertions.assertEquals("Win for Roma", game.score(player1,player2));
    }

    @Test
    public void advantageTest(){
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player1);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);
        game.wonPoint(player2);

        Assertions.assertEquals("Advantage for Vasya", game.score(player1, player2));
    }

}