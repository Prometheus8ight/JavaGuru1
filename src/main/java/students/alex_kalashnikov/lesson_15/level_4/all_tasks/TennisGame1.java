package students.alex_kalashnikov.lesson_15.level_4.all_tasks;

public class TennisGame1 implements TennisGame {

    private int scorePlayer1;
    private int scorePlayer2;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            scorePlayer1++;
        else
            scorePlayer2++;
    }

    public String score() {
        StringBuilder score = new StringBuilder();
        if (scorePlayer1 == scorePlayer2) {
            score = new StringBuilder(switch (scorePlayer1) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                default -> "Deuce";
            });
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            int scoreDifference = scorePlayer1 - scorePlayer2;
            score = new StringBuilder(switch (scoreDifference) {
                case -1 -> "Advantage " + player2Name;
                case 1 -> "Advantage " + player1Name;
                case 2, 3, 4 -> "Win for " + player1Name;
                default -> "Win for " + player2Name;
            });
        } else {
            for (int i = 1; i < 3; i++) {
                int scoreFromZeroToThree;
                if (i == 1) {
                    scoreFromZeroToThree = scorePlayer1;
                }
                else {
                    score.append("-");
                    scoreFromZeroToThree = scorePlayer2;
                }
                switch (scoreFromZeroToThree) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }

}