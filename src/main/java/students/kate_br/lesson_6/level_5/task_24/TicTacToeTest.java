package students.kate_br.lesson_6.level_5.task_24;

 class TicTacToeTest {

     public static void main(String[] args) {

         TicTacToeTest test = new TicTacToeTest();
         test.leftCornerFirstTest(new int[][]{{1, 0, -1}, {0, 1, 0}, {-1, 1, 1}}, 1);
         test.leftCornerSecondTest(new int[][]{{0, 1, 0}, {-1, 0, 1}, {-1, 1, 0}}, 0);
         test.leftCornerFailTest(new int[][]{{1, 1, -1}, {0, 0, 1}, {0, -1, 0}}, 0);
         test.rightCornerFirstTest(new int[][]{{1, 0, 1}, {0, 1, -1}, {1, -1, 0}}, 1);
         test.rightCornerSecondTest(new int[][]{{1, 0, 0}, {-1, 0, 1}, {0, 1, -1}}, 0);
         test.rightCornerFailTest(new int[][]{{0, -1, 1}, {1, 0, 1}, {-1, 0, -1}}, 0);
     }

     public void leftCornerFirstTest(int[][] field, int playerToCheck){

         TicTacToe ticTacToe = new TicTacToe();
         boolean realResult = ticTacToe.checkCornerDiagonals(field, playerToCheck);
         checkTestResult(realResult, "Left corner first test");
     }

     public void leftCornerSecondTest(int[][] field, int playerToCheck){

         TicTacToe ticTacToe = new TicTacToe();
         boolean realResult = ticTacToe.checkCornerDiagonals(field, playerToCheck);
         checkTestResult(realResult, "Left corner second test");
     }

     public void leftCornerFailTest(int[][] field, int playerToCheck){

         TicTacToe ticTacToe = new TicTacToe();
         boolean realResult = ticTacToe.checkCornerDiagonals(field, playerToCheck);
         checkTestResult(realResult, "Left corner fail test");
     }

     public void rightCornerFirstTest(int [][] field, int playerToCheck){

         TicTacToe ticTacToe = new TicTacToe();
         boolean realResult = ticTacToe.checkCornerDiagonals(field, playerToCheck);
         checkTestResult(realResult, "Right corner first test");
     }

     public void rightCornerSecondTest(int[][] field, int playerToCheck){

         TicTacToe ticTacToe = new TicTacToe();
         boolean realResult = ticTacToe.checkCornerDiagonals(field, playerToCheck);
         checkTestResult(realResult, "Right cornet second test");
     }

     public void rightCornerFailTest(int[][] field, int playerToCheck){

         TicTacToe ticTacToe = new TicTacToe();
         boolean realResult = ticTacToe.checkCornerDiagonals(field, playerToCheck);
         checkTestResult(realResult, "Right corner fail test");
     }

     private void checkTestResult(boolean condition, String testName){

         if (condition){
             System.out.println(testName + ": Test OK");
         }else {
             System.out.println(testName + ": Test FAIL");
         }
     }

}
