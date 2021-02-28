package students.rodion_afanasjev.lesson_6.level_5.task_22;

class TicTacToe {

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int row = 0; row < 3; row++) {
            if (field[row][0] == field[row][1] && field[row][1] == field[row][2] && field[row][0] != -1) {
                return true;
            }
        }
        return false;
    }
}
