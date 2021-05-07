package students.alex_kalashnikov.lesson_15.level_3.all_tasks;

import java.util.List;

class TennisGameUtils implements TennisGame {

    private final String playerOne;
    private final String playerTwo;
    private int playerOneScore;
    private int playerTwoScore;
    private final List<String> scores = List.of(
            "Love",      //0 очков
            "Fifteen",   //1 очко
            "Thirty",    //2 очка
            "Forty",     //3 очка
            "Advantage", //4 очка
            "Win"        //5 очков
    );

    public TennisGameUtils(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
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
        if (playerOneScore > 3 && playerOneScore - playerTwoScore > 1) {
            return "Win " + playerOne;
        } else if (playerTwoScore > 3 && playerTwoScore - playerOneScore > 1) {
            return "Win " + playerTwo;
        } else if (playerOneScore == playerTwoScore && playerOneScore > 2) {
            return "Deuce";
        } else if (playerOneScore > 3 && playerOneScore - playerTwoScore == 1) {
            return "Advantage " + playerOne;
        } else if (playerTwoScore > 3 && playerTwoScore - playerOneScore == 1) {
            return "Advantage " + playerTwo;
        }
        return scores.get(playerOneScore) + " - " + scores.get(playerTwoScore);
    }

}