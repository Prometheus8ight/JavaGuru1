package students.vitaly_porsev.lesson_6.level_5.task_25;

class TicTacToe {

    public boolean isPlayerWinning(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVertical(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return hasSameElementsHorizontal(field, playerToCheck);
    }

    public boolean isWinPositionForVertical(int[][] field, int playerToCheck) {
        return hasSameElementsVerticals(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return hasSameElementsDiagonals(field, playerToCheck);
    }

    private boolean hasSameElementsHorizontal(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            int counter = 0;
            for (int anInt : ints) {
                if (anInt == playerToCheck) {
                    counter++;
                    if (counter == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasSameElementsVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < 3; j++) {
            if (field[0][j] == playerToCheck && field[1][j] == playerToCheck
                    && field[2][j] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSameElementsDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck
                && field[2][2] == playerToCheck) {
            return true;
        }
        return field[0][2] == playerToCheck && field[1][1] == playerToCheck
                && field[2][0] == playerToCheck;
    }
}