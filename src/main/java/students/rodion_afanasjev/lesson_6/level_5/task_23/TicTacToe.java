package students.rodion_afanasjev.lesson_6.level_5.task_23;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int column = 0; column < 3; column++) {
            if (field[0][column] == field[1][column] && field[1][column] == field[2][column] && field[0][column] != -1) {
                return true;
            }
        }
        return false;
    }

}
