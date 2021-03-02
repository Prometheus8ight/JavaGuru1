package students.alex_kalashnikov.lesson_6.level_5.task_24;

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
        boolean hit = false; // тест на победу для первая диагонали
        boolean hit1 = false; // тест на победу для второй диагонали
        int j = 0;
        int k = 0;
        int numberOfHits = 0;
        int numberOfHits1 = 0;

        for (int i = 0; i < field.length; i++) {    // для первой диагонали
            if (field[i][j] == playerToCheck) {
                numberOfHits++;
            }
            j++;
            if (numberOfHits == 3) {
                return hit = true;
            }
        }
        for (int i = 2; i > -1; i--) {              // для второй диагонали
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

}