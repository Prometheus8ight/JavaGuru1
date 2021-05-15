package students.alex_kalashnikov.lesson_15.level_4.all_tasks;

public class TennisGame3 implements TennisGame {

    private int player1Points;
    private int player2Points;
    private final String player1Score;
    private final String player2Score;

    public TennisGame3(String player1Score, String player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public String score() {
        String score;
        if (player1Points < 4 && player2Points < 4 && !(player1Points + player2Points == 6)) {
            String[] pointNameArr = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            score = pointNameArr[player1Points];
            return (player1Points == player2Points)
                    ? score + "-All" : score + "-" + pointNameArr[player2Points];
        } else {
            if (player1Points == player2Points)
                return "Deuce";
            score = player1Points > player2Points ? player1Score : player2Score;
            return ((player1Points - player2Points) * (player1Points - player2Points) == 1)
                    ? "Advantage " + score : "Win for " + score;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            this.player1Points++;
        else
            this.player2Points++;
    }

}