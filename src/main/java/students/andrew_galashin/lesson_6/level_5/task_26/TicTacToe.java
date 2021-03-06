package students.andrew_galashin.lesson_6.level_5.task_26;

class TicTacToe {
    public boolean isDrawPosition(int[][] field) {
        if (!isWin(field, 0) && !isWin(field, 1)) {
            return full(field);
        }
        return false;
    }


    public boolean horizontal(int[][] x, int check) {
        for (int i = 0; i < x.length; i++) {
            int j = 0;
            for (int a = 0; a < x[i].length; a++) {
                if (x[i][a] == check) {
                    j++;
                    if (j == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean full(int[][] field) {
        boolean x = true;
        for (int[] arr : field) {
            for (int arr1 : arr) {
                if (arr1 == -1) {
                    x = false;
                    break;
                }
            }
        }
        return x;
    }


    public boolean isWin(int[][] field, int playerToCheck) {
        return horizontalWin(field, playerToCheck) || verticalWin(field, playerToCheck) || diagonalWin(field, playerToCheck);
    }


    public boolean horizontalWin(int[][] field, int playerToCheck) {
        return horizontal(field, playerToCheck);
    }

    public boolean verticalWin(int[][] field, int playerToCheck) {
        return isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean diagonalWin(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck;
        }
    }

}

