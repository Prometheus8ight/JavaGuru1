package students.kate_br.lesson_6.level_5.task_22;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return isWinPositionForHorizontals(field, playerToCheck);
    }

    public boolean checkHorizontalPosition(int[][] field, int playerToCheck) {

        int count = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {

                if (field[i][j] == playerToCheck) {
                    count++;

                    if (count == field[i].length) {
                        return true;
                    }
                }
            }

        }
        return false;
    }


}

