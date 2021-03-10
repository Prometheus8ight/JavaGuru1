package students.deniss_jankovskis.lesson_6.level_5.task_24;

class TicTacToe {
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                    return true;
                } else if (field[2][0] == field[1][1] && field[1][1] == field[0][2]) {
                    return true;
                }
            }
        }
        return false;
    }


}
