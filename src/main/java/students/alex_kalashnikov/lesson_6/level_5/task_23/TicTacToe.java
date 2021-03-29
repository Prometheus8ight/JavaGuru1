package students.alex_kalashnikov.lesson_6.level_5.task_23;

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

}