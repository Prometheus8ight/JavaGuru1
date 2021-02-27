package students.julija_katukova.lesson_6.level_5.task_22;

class TicTacToe {
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkForHorizontals(field, playerToCheck);
    }

    public boolean checkForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int count = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    count++;
                }
                if (count == field[i].length) {
                    return true;
                }
            }
        }
        return false;
    }

    /*public void display(int[][] field) {
        for (int i = 0; i < field.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < field[i].length; j++) { //this equals to the column in each row.
                System.out.print(field[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    } */
}
