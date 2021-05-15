package students.alex_kalashnikov.lesson_15.level_4.all_tasks;

public class TennisGame2 implements TennisGame {

    private int player1Points;
    private int player2Points;
    private String player1Result;
    private String player2Result;
    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String score() {
        if (player1Points == player2Points && player1Points < 3) {
            return evenScoreFromZeroToForty();
        } else if (player1Points == player2Points && player1Points > 2) {
            return "Deuce";
        } else if (player1Points > 0 && player1Points < 4 && player2Points == 0) {
            return playerXLeadsAgainstPlayerYZero(player1Points) + "-Love";
        } else if (player2Points > 0 && player2Points < 4 && player1Points == 0) {
            return "Love-" + playerXLeadsAgainstPlayerYZero(player2Points);
        } else if (player1Points < 4 && player2Points < 4) {
            return scoreBeforeAdvantage();
        } else if (player1Points > player2Points && player2Points >= 3 && difference() == 1) {
            return "Advantage " + player1Name;
        } else if (player2Points > player1Points && player1Points >= 3 && difference() == -1) {
            return "Advantage " + player2Name;
        } else if (player1Points > 3 && (player1Points - player2Points) > 1 && difference() > 1) {
            return "Win for " + player1Name;
        } else {
            return "Win for " + player2Name;
        }
    }

    public void wonPoint(String player) {
        if (player.equals(player1Name))
            player1Points++;
        else
            player2Points++;
    }

    private String evenScoreFromZeroToForty() {
        if (player1Points == 0) {
            return "Love-All";
        } else if (player1Points == 1) {
            return "Fifteen-All";
        }
        return "Thirty-All";
    }

    private String playerXLeadsAgainstPlayerYZero(int playerXPoints) {
        if (playerXPoints == 1) {
            return "Fifteen";
        } else if (playerXPoints == 2) {
            return "Thirty";
        }
        return "Forty";
    }

    private String scoreBeforeAdvantage() {
        if (player1Points == 1) {
            player1Result = "Fifteen";
        }
        if (player1Points == 2) {
            player1Result = "Thirty";
        }
        if (player1Points == 3) {
            player1Result = "Forty";
        }
        if (player2Points == 1) {
            player2Result = "Fifteen";
        }
        if (player2Points == 2) {
            player2Result = "Thirty";
        }
        if (player2Points == 3) {
            player2Result = "Forty";
        }
        return player1Result + "-" + player2Result;
    }

    private int difference() {
        return player1Points - player2Points;
    }

}