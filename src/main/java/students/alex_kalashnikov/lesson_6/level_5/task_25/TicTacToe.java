package students.alex_kalashnikov.lesson_6.level_5.task_25;

class TicTacToe {


    public int[][] create(int length) {
        return new int[length][length];
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHit = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == playerToCheck) {
                    numberOfHit++;
                }
            }
            if (numberOfHit == 3) {
                return hit = true;
            }
        }
        return hit;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean hit = false;
        for (int i = 0; i < field.length; i++) {
            int numberOfHit = 0;
            for (int j = 0; j < field.length; j++) {
                if (field[j][i] == playerToCheck) {
                    numberOfHit++;
                }
            }
            if (numberOfHit == 3) {
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
        int numberOfHit = 0;
        int numberOfHit1 = 0;

        for (int i = 0; i < field.length; i++) {                    // для одной диагонали
            if (field[i][j] == playerToCheck) {
                numberOfHit++;
            }
            j++;
            if (numberOfHit == 3) {
                return hit = true;
            }
        }
        for (int i = 2; i > -1; i--) {                              // для другой диагонали
            if (field[k][i] == playerToCheck) {
                numberOfHit1++;
            }
            k++;
            if (numberOfHit1 == 3) {
                return hit1 = true;
            }
        }
        return hit || hit1;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck);

    }

}