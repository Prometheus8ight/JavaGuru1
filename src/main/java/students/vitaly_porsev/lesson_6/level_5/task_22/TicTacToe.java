package students.vitaly_porsev.lesson_6.level_5.task_22;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int counter = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    counter++;
                    if (counter == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
