package students.julija_katukova.lesson_15.level_3;

class Score43Processor implements ScoreProcessor {

    @Override
    public boolean canProcess(int player1Score, int player2Score) {
        return player1Score == 4 && player2Score == 3;
    }

    @Override
    public int processPlayer1(int player1Score, int player2Score, String playerName) {
        if (playerName.equals("player1")) {
            return player1Score + 1;
        }
        return player1Score;
    }

    @Override
    public int processPlayer2(int player1Score, int player2Score, String playerName) {
        if (playerName.equals("player2")) {
            return player1Score - 1;
        }
        return player1Score;
    }
}
