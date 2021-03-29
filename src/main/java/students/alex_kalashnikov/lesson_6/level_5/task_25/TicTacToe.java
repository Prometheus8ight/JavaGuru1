package students.alex_kalashnikov.lesson_6.level_5.task_25;

class TicTacToe {

    public int[][] create(int length) {
        return new int[length][length];
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHits = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == playerToCheck) {
                    numberOfHits++;
                }
            }
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        return hit;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHits = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == playerToCheck) {
                    numberOfHits++;
                }
            }
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        return hit;

    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean hit = false;
        boolean hit1 = false;
        int j = 0;
        int k = 0;
        int numberOfHits = 0;
        int numberOfHits1 = 0;

        for (int i = 0; i < field.length; i++) {                    // для одной диагонали
            if (field[i][j] == playerToCheck) {
                numberOfHits++;
            }
            j++;
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        for (int i = 2; i > -1; i--) {                              // для другой диагонали
            if (field[k][i] == playerToCheck) {
                numberOfHits1++;
            }
            k++;
            if (numberOfHits1 == 3) {
                return hit1 = true;
            }
        }
        return hit || hit1;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);
    }

}