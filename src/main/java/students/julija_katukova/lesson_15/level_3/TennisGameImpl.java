package students.julija_katukova.lesson_15.level_3;

import java.util.List;

class TennisGameImpl implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    @Override
    public void wonPoint(String playerName) {

        List<ScoreProcessor> processors = List.of(
                new Score03Processor(),
                new Score34Processor(),
                new Score43Processor()
        );

        if(processors.get(0).canProcess(player1Score, player2Score)) {
            this.player1Score = processors.get(0).processPlayer1(player1Score, player2Score, playerName);
            this.player2Score = processors.get(0).processPlayer2(player1Score, player2Score, playerName);
        }

        if(processors.get(1).canProcess(player1Score, player2Score)) {
            this.player2Score = processors.get(1).processPlayer1(player1Score, player2Score, playerName);
            this.player2Score = processors.get(1).processPlayer1(player1Score, player2Score, playerName);
        }

        if(processors.get(2).canProcess(player1Score, player2Score)) {
            this.player1Score = processors.get(2).processPlayer1(player1Score, player2Score, playerName);
            this.player1Score = processors.get(2).processPlayer1(player1Score, player2Score, playerName);
        }

    }

    @Override
    public String score() {
        String gameScorePlayer1 = null;
        String gameScorePlayer2 = null;
        System.out.println(player1Score + " - " + player2Score);

        if (player1Score == 4 && player2Score == 0 ||
                player1Score == 4 && player2Score == 1 ||
                player1Score == 4 &&  player2Score == 2 ||
                player1Score == 5 && player2Score == 3) {
                return "Win player1";
        }
        else if (player2Score == 4 && player1Score == 0 ||
                player2Score == 4 && player1Score == 1 ||
                player2Score == 4 && player1Score == 2 ||
                player2Score == 5 && player1Score == 3) {
            return "Win player2";
        }
        else if (player1Score == 3 && player2Score == 3) {
            return "Deuce";
        }
        else if (player1Score == 4 && player2Score == 3) {
            return "Advantage player1";
        }
        else if (player1Score == 3 && player2Score == 4) {
            return "Advantage player2";
        }
        else {
            switch (player1Score) {
                case 0 -> gameScorePlayer1 = "Love";
                case 1 -> gameScorePlayer1 = "Fifteen";
                case 2 -> gameScorePlayer1 = "Thirty";
                case 3 -> gameScorePlayer1 = "Forty";
            }
            switch (player2Score) {
                case 0 -> gameScorePlayer2 = "Love";
                case 1 -> gameScorePlayer2 = "Fifteen";
                case 2 -> gameScorePlayer2 = "Thirty";
                case 3 -> gameScorePlayer2 = "Forty";
            }

            return gameScorePlayer1 + " - " + gameScorePlayer2;
        }
    }
}
