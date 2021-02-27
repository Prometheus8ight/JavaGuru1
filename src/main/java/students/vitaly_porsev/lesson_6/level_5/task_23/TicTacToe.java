package students.vitaly_porsev.lesson_6.level_5.task_23;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
            for (int j = 0; j < 3; j++) {
                if (field[0][j] == playerToCheck && field[1][j] == playerToCheck
                        && field[2][j] == playerToCheck) {
                    return true;
                }
            }
        return false;
    }
}
