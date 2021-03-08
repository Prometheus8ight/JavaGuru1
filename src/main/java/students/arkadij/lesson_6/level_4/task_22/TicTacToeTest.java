package students.arkadij.lesson_6.level_4.task_22;

class TicTacToeTest {

    void allTests(){
        rowOneWinTest();
        rowTwoWinTest();
        rowThreeWinTest();
    }

    public void checkWinResultTest(boolean checkWin, String nameTest){
        if (checkWin){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void rowOneWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0,0,0},{-1,1,1},{-1,-1,-1}};
        checkWinResultTest(ticTacToe.isWinPositionForHorizontals(arr,0),"First row one win test");
    }

    public void rowTwoWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{-1,-1,-1},{0,0,0},{-1,1,1}};
        checkWinResultTest(ticTacToe.isWinPositionForHorizontals(arr,0),"Second row one win test");
    }

    public void rowThreeWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{-1,-1,-1},{-1,1,1},{0,0,0}};
        checkWinResultTest(ticTacToe.isWinPositionForHorizontals(arr,0),"Third row one win test");
    }

}
