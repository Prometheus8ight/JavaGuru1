package students.deniss_jankovskis.lesson_6.level_5.task_23;

class TicTacToe {

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean checkWinPositionForVerticals(int[][] field, int playerToCheck) {
        
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[j].length; j++) {
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
