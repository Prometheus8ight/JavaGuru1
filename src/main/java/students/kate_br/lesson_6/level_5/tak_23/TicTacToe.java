package students.kate_br.lesson_6.level_5.tak_23;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkVerticalsPosition(field, playerToCheck);
    }

    public boolean checkVerticalsPosition(int[][] field, int playerToCheck) {


        for (int j = 0; j < field.length; j++) {
            int count = 0;
            for (int i = 0; i < field[j].length; i++) {

                if (field[j][i] == playerToCheck) {
                    count++;
                }

                if (count == field[j].length) {
                    return true;
                }

            }
        }

        return false;

    }
}
