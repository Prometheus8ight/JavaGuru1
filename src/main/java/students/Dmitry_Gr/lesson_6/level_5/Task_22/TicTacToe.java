package students.Dmitry_Gr.lesson_6.level_5.Task_22;


class TicTacToe {
     boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean rows;
        for (int row = 0; row < field.length; row++) {
            rows= true;
            for (int col = 0; col < field[row].length; col++) {
                rows &= (field[row][col] == playerToCheck);
            }
            if (rows) { return true; }


        }
        return false;
    }
}


