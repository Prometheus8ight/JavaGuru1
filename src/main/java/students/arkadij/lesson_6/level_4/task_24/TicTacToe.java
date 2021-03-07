package students.arkadij.lesson_6.level_4.task_24;

class TicTacToe {

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        if (field[0][0] == playerToCheck
                && field[1][1] == playerToCheck
                && field[2][2] == playerToCheck){
            return true;
        }
        return field[0][2] == playerToCheck
                && field[1][1] == playerToCheck
                && field[2][0] == playerToCheck;
    }

}
