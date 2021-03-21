package students.andrew_galashin.lesson_6.level_5.task_24;

public class TicTacToe {

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck;
        }
    }
}
