package students.Dmitry_Gr.lesson_6.level_5.Task_23;

 class TicTacToe {
     public boolean isWinPositionForVertical(int[][] field, int playerToCheck) {
         boolean cols;
         for (int row = 0; row < field.length; row++) {
             cols= true;
             for (int col = 0; col < field[row].length; col++) {
                 cols &= (field[col][row] == playerToCheck);
             }
             if (cols) { return true; }


         }
         return false;
     }
 }


