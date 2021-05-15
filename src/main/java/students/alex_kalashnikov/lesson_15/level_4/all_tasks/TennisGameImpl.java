package students.alex_kalashnikov.lesson_15.level_4.all_tasks;

import java.util.List;

class TennisGameImpl implements TennisGame {

    private final String playerOne;
    private final String playerTwo;
    private int playerOneScore;
    private int playerTwoScore;
    private final List<String> scores = List.of(
            "Love",
            "Fifteen",
            "Thirty",
            "Forty"
    );

    public TennisGameImpl(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(playerOne)) {
            playerOneScore++;
        } else {
            playerTwoScore++;
        }
    }

    @Override
    public String score() {
        if (playerOneScore > 3 && scoreDifference() > 1) {
            return "Win " + playerOne;
        } else if (playerTwoScore > 3 && scoreDifference() < -1) {
            return "Win " + playerTwo;
        } else if (playerOneScore == playerTwoScore && playerOneScore > 2) {
            return "Deuce";
        } else if (playerOneScore > 3 && scoreDifference() == 1) {
            return "Advantage " + playerOne;
        } else if (playerTwoScore > 3 && scoreDifference() == -1) {
            return "Advantage " + playerTwo;
        }
        return scores.get(playerOneScore) + " - " + scores.get(playerTwoScore);
    }

    private int scoreDifference() {
        return playerOneScore - playerTwoScore;
    }

}