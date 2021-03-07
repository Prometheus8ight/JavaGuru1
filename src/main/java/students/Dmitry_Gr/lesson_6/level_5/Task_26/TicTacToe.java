package students.Dmitry_Gr.lesson_6.level_5.Task_26;

public class TicTacToe {
    final int SIGN_X = 1;
    final int SIGN_O = 0;
    final int SIGN_EMPTY = -1;

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
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

    public boolean isWinPositionForVertical(int[][] field, int playerToCheck) {
        boolean cols;
        for (int row = 0; row < field.length; row++) {
            cols= true;
            for (int col = 0; col < field[row].length; col++) {
                cols &= (field[col][row] == playerToCheck);
            }
            if (cols) { return true; }


        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < field.length; i++) {
            toright &= (field[i][i] == playerToCheck);
            toleft &= (field[field.length - i - 1][i] == playerToCheck);
        }

        if (toright || toleft) return true;
        return false;
    }
    public boolean isWinPosition(int[][] field, int playerToCheck){
        return isWinPositionForHorizontals(field, playerToCheck) &&
                isWinPositionForVertical(field, playerToCheck)    &&
                isWinPositionForDiagonals(field,playerToCheck);
    }
    public boolean isDrawPosition(int[][] field){
        for (int row = 0; row < field.length; row++)
            for (int col = 0; col < field[row].length; col++)
                if (field[row][col] == -1)
                    return false;
        return true;
    }

}


