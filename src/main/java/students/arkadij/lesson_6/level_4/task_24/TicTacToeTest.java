package students.arkadij.lesson_6.level_4.task_24;

class TicTacToeTest {

    void allTests(){
        rowDiagOneWinTest();
        rowDiagTwoWinTest();
    }

    private void checkDiagWinTest(boolean checkWin, String nameTest){
        if (checkWin){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void rowDiagOneWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0,1,1},{1,0,-1},{-1,1,0}}; // FAIL ---> {{0,1,1},{1,1,-1},{-1,1,0}}
        checkDiagWinTest(ticTacToe.isWinPositionForDiagonals(arr,0),"First diagonal row one win test");
    }

    public void rowDiagTwoWinTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{1,1,0},{-1,0,1},{0,1,-1}}; // FAIL ---> {{1,1,0},{-1,0,1},{-1,1,-1}}
        checkDiagWinTest(ticTacToe.isWinPositionForDiagonals(arr,0),"Second diagonal row one win test");
    }

}
