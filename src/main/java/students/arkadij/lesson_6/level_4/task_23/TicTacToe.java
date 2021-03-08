package students.arkadij.lesson_6.level_4.task_23;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int colNum = 0; colNum < 3; colNum++){
            if (field[0][colNum] == playerToCheck
                    && field[1][colNum] == playerToCheck
                    && field[2][colNum] == playerToCheck
                    && field[0][colNum] != -1){
                return true;
            }
        }
        return false;
    }

}
