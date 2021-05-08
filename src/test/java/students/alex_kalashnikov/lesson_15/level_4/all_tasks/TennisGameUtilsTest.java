package students.alex_kalashnikov.lesson_15.level_4.all_tasks;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TennisGameUtilsTest {

    private final int player1Score;
    private final int player2Score;
    private final String expectedScore;

    public TennisGameUtilsTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "Love - Love" },
                { 1, 1, "Fifteen - Fifteen" },
                { 2, 2, "Thirty - Thirty"},
                { 3, 3, "Deuce"},
                { 4, 4, "Deuce"},

                { 1, 0, "Fifteen - Love"},
                { 0, 1, "Love - Fifteen"},
                { 2, 0, "Thirty - Love"},
                { 0, 2, "Love - Thirty"},
                { 3, 0, "Forty - Love"},
                { 0, 3, "Love - Forty"},
                { 4, 0, "Win player1"},
                { 0, 4, "Win player2"},

                { 2, 1, "Thirty - Fifteen"},
                { 1, 2, "Fifteen - Thirty"},
                { 3, 1, "Forty - Fifteen"},
                { 1, 3, "Fifteen - Forty"},
                { 4, 1, "Win player1"},
                { 1, 4, "Win player2"},

                { 3, 2, "Forty - Thirty"},
                { 2, 3, "Thirty - Forty"},
                { 4, 2, "Win player1"},
                { 2, 4, "Win player2"},

                { 4, 3, "Advantage player1"},
                { 3, 4, "Advantage player2"},
                { 5, 4, "Advantage player1"},
                { 4, 5, "Advantage player2"},
                { 15, 14, "Advantage player1"},
                { 14, 15, "Advantage player2"},

                { 6, 4, "Win player1"},
                { 4, 6, "Win player2"},
                { 16, 14, "Win player1"},
                { 14, 16, "Win player2"},
        });
    }

    public void checkAllScores(TennisGame game) {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        for (int i = 0; i < highestScore; i++) {
            if (i < this.player1Score)
                game.wonPoint("player1");
            if (i < this.player2Score)
                game.wonPoint("player2");
        }
        assertEquals(this.expectedScore, game.score());
    }

    @Test
    public void checkAllScoresTennisGame1() {
        TennisGameUtils game = new TennisGameUtils("player1", "player2");
        checkAllScores(game);
    }

}