package students.deniss_jankovskis.lesson_6.level_5.task_25;

class TicTacToe {

    public boolean isWinPosition(int[][] field, int playerToCheck) {

        boolean isWinHorizontal = isWinPositionForHorizontals(field, playerToCheck);
        boolean isWinVertical = isWinPositionForVerticals(field, playerToCheck);
        boolean isWinDiagonal = isWinPositionForDiagonals(field, playerToCheck);
        return isWinHorizontal || isWinVertical || isWinDiagonal;
    }

    public boolean checkWinHorizontalPosition(int[][] field, int playerToCheck) {

        int count = 0;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == playerToCheck) {
                    count++;
                }
                if (count == 3) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean checkWinVerticalPosition(int[][] field, int playerToCheck) {

        for (int j = 0; j < 3; j++) {
            if (field[0][j] == playerToCheck && field[1][j] == playerToCheck
                    && field[2][j] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean checkWinDiagonalPosition(int[][] field, int playerToCheck) {

        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck
                && field[2][2] == playerToCheck) {
            return true;
        }
        return field[0][2] == playerToCheck && field[1][1] == playerToCheck
                && field[2][0] == playerToCheck;
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return checkWinHorizontalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return checkWinVerticalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return checkWinDiagonalPosition(field, playerToCheck);
    }


}
