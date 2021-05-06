package students.julija_katukova.lesson_15.level_3;

class Score34Processor implements ScoreProcessor {

    @Override
    public boolean canProcess(int player1Score, int player2Score) {
        return player1Score == 3 && player2Score == 4;
    }

    @Override
    public int processPlayer1(int player1Score, int player2Score, String playerName) {
        if (playerName.equals("player1")) {
            return player2Score - 1;
        }
        return player2Score;
    }

    @Override
    public int processPlayer2(int player1Score, int player2Score, String playerName) {
        if (playerName.equals("player2")) {
            return player2Score + 1;
        }
        return player2Score;
    }
}
