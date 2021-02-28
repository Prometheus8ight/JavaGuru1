package students.rodion_afanasjev.lesson_6.level_5.task_22;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkHorizontals(field, playerToCheck);
    }

    public boolean checkHorizontals(int[][] field, int playerToCheck) {
        int count = 0;
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column] == playerToCheck) {
                    count++;
                    if (count == field[row].length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
