package students.julija_katukova.lesson_15.level_3;

interface ScoreProcessor {

    boolean canProcess(int player1Score, int player2Score);

    int processPlayer1(int player1Score, int player2Score, String playerName);

    int processPlayer2(int player1Score, int player2Score, String playerName);

}
