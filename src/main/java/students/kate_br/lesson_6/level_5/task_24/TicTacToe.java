package students.kate_br.lesson_6.level_5.task_24;

class TicTacToe {

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkCornerDiagonals(field, playerToCheck);
    }


    public boolean checkCornerDiagonals(int[][] field, int playerToCheck) {

        return (field[0][0] == field[1][1] && field[1][1] == field[2][2]) || (field[2][0] == field[1][1] && field[1][1] == field[0][2]);
    }

}



