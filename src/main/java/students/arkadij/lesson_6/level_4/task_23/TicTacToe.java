package students.arkadij.lesson_6.level_4.task_23;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int rowNum : field[playerToCheck]){
            int count = 0;
            for (int colNum : field[rowNum]){
                if ((rowNum & colNum) == playerToCheck) {
                    count++;
                } else {
                    count = 0;
                } if (count >= 3){
                        return true;
                    }
                }
            }
        return false;
    }

}
