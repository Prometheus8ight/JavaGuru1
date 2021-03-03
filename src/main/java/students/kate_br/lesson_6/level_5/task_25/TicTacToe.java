package students.kate_br.lesson_6.level_5.task_25;

class TicTacToe {

    public boolean isWinPosition(int[][] field, int playerToCheck) {

        boolean isWinHorizontal = isWinPositionForHorizontals(field, playerToCheck);
        boolean isWinVertical = isWinPositionForVerticals(field, playerToCheck);
        boolean isWinDiagonal = isWinPositionForDiagonals(field, playerToCheck);
        return isWinHorizontal || isWinVertical || isWinDiagonal;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        return checkHorizontalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        return checkVerticalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        return checkCornerDiagonals(field, playerToCheck);
    }


    public boolean checkHorizontalPosition(int[][] field, int playerToCheck) {


        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++) {

                if (field[i][j] == playerToCheck) {
                    count++;
                }

                if (count == field[i].length) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean checkVerticalPosition(int[][] field, int playerToCheck) {

        for (int j = 0; j < field.length; j++) {
            int count = 0;
            for (int i = 0; i < field[j].length; i++) {

                if (field[i][j] == playerToCheck) {
                    count++;
                }

                if (count == field[j].length) {
                    return true;

                }
            }
        }

        return false;
    }

    public boolean checkCornerDiagonals(int[][] field, int playerToCheck) {


        if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
            return true;
        } else if (field[2][0] == field[1][1] && field[1][1] == field[0][2]) {
            return true;

        }

        return false;
    }


}
