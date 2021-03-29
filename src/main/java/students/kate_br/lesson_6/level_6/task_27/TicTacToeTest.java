package students.kate_br.lesson_6.level_6.task_27;

import java.util.Arrays;

class TicTacToeTest {

     public static void main(String[] args) {

         TicTacToeTest test = new TicTacToeTest();
         test.createField();
         test.createFieldFail();

     }

     public void createField(){

         TicTacToe ticTacToe = new TicTacToe();
         int[][] realResult = ticTacToe.createField();
         checkTestResult(realResult, new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}, "Create field test");

     }

     public void createFieldFail(){

         TicTacToe ticTacToe = new TicTacToe();
         int[][] realResult = ticTacToe.createField();
         checkTestResult(realResult, new int[][]{{-1, 0, -1},{-1, -1, -1}, {-1, 1, -1} } , "Create field fail test");

     }

     private void checkTestResult(int[][] realResult, int[][] expectedResult, String testName){
         if (Arrays.deepEquals(realResult, expectedResult)){
             System.out.println(testName + ": Test OK");
         }else {
             System.out.println(testName + ": Test FAIL");
         }
     }


}
