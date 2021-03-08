package students.arkadij.lesson_6.level_4.task_22;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        for (int rowNum = 0; rowNum < field.length; rowNum++){
            int count = 0;
            for (int colNum = 0; colNum < field[rowNum].length; colNum++){
                if (field[rowNum][colNum] == playerToCheck){
                    count++;
                } else {
                    count = 0;
                } if (count>=3){
                    return true;
                }
            }
        }
        return false;
    }

}
