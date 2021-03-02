package students.kristine_paskevica.lesson_6.level_5;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    count++;
                    if (count == field[i].length) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}