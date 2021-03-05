package students.kristine_paskevica.lesson_6.level_5;

class TicTacToe24 {

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return checkForDiagonals(field, playerToCheck);
    }

    public boolean checkForDiagonals(int[][] field, int playerToCheck) {
        boolean check1 = fromLeftCorner(field, playerToCheck);
        boolean check2 = fromRightCorner(field, playerToCheck);
        return check1 || check2;
    }

    public boolean fromLeftCorner(int[][] field, int playerToCheck) { //laukuma kreisais stūris
        int count = 0;
        int j = 0;
        for (int[] ints : field) {
            if (ints[j] == playerToCheck) {
                count++;
            }
            j++;
            if (count == ints.length) {
                return true;
            }
        }
        return false;
    }

    public boolean fromRightCorner(int[][] field, int playerToCheck) { //laukuma labais stūris
        int count = 0;
        int j = field.length - 1;
        for (int[] ints : field) {
            if (ints[j] == playerToCheck) {
                count++;
            }
            j--;
            if (count == ints.length) {
                return true;
            }
        }
        return false;
    }
}

