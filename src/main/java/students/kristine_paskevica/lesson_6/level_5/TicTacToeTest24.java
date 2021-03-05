package students.kristine_paskevica.lesson_6.level_5;

 class TicTacToeTest24 {

     public static void main(String[] args) {
         TicTacToeTest24 testi = new TicTacToeTest24();
         testi.komb1(new int[][]{{0, 0, -1}, {-1, 0, -1}, {-1, -1, 0}}, 0);
         testi.komb2(new int[][]{{1, 0, -1}, {0, 1, -1}, {-1, 0, 1}}, 1);
         testi.komb3(new int[][]{{1, 0, -1}, {0, -1, -1}, {-1, 0, 1}}, 1);
         testi.komb4(new int[][]{{1, 1, 0}, {0, 0, -1}, {0, 0, 1}}, 0);
         testi.komb5(new int[][]{{1, -1, 1}, {0, 1, -1}, {1, 0, 0}}, 1);
         testi.komb6(new int[][]{{-1, -1, -1}, {-1, 0, -1}, {-1, -1, -1}}, 0);
     }

     public void komb1 (int[][] field, int playerToCheck) {
         TicTacToe24 testi = new TicTacToe24();
         boolean realResult = testi.isWinPositionForDiagonals(field, playerToCheck);
         check(realResult, true, "Vinnesta kombinācijas tests 1");
     }

     public void komb2 (int[][] field, int playerToCheck) {
         TicTacToe24 testi = new TicTacToe24();
         boolean realResult = testi.isWinPositionForDiagonals(field, playerToCheck);
         check(realResult, true, "Vinnesta kombinācijas tests 2");
     }

     public void komb3 (int[][] field, int playerToCheck) {
         TicTacToe24 testi = new TicTacToe24();
         boolean realResult = testi.isWinPositionForDiagonals(field, playerToCheck);
         check(realResult, false, "Vinnesta kombinācijas tests 3");
     }

     public void komb4 (int[][] field, int playerToCheck) {
         TicTacToe24 testi = new TicTacToe24();
         boolean realResult = testi.isWinPositionForDiagonals(field, playerToCheck);
         check(realResult, true, "Vinnesta kombinācijas tests 4");
     }

     public void komb5 (int[][] field, int playerToCheck) {
         TicTacToe24 testi = new TicTacToe24();
         boolean realResult = testi.isWinPositionForDiagonals(field, playerToCheck);
         check(realResult, true, "Vinnesta kombinācijas tests 5");
     }

     public void komb6 (int[][] field, int playerToCheck) {
         TicTacToe24 testi = new TicTacToe24();
         boolean realResult = testi.isWinPositionForDiagonals(field, playerToCheck);
         check(realResult, false, "Vinnesta kombinācijas tests 6");
     }

     public void check (boolean realResult, boolean expectedResult, String testName) {
         if (realResult == expectedResult) {
             System.out.println(testName + " = ir precīza");
         }
         else {
             System.out.println(testName + " = nav precīza");
         }
     }
}
