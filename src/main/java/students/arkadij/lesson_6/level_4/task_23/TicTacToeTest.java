package students.arkadij.lesson_6.level_4.task_23;

class TicTacToeTest {

    void allTests(){
        rowWinOneTest();
        rowWinTwoTest();
        rowWinThreeTest();
    }

    private void checkWinResultTest(boolean checkWin, String nameTest){
        if (checkWin){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void rowWinOneTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0,1,1},{0,1,1},{0,1,1}}; // FAIL ---> {{1,1,1},{0,1,1},{0,1,1}}
        checkWinResultTest(ticTacToe.isWinPositionForVerticals(arr,0),"First row one win test");
    }

    public void rowWinTwoTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{1,0,1},{1,0,1},{1,0,1}}; // FAIL ---> {{1,1,1},{1,0,1},{1,0,1}}
        checkWinResultTest(ticTacToe.isWinPositionForVerticals(arr,0),"Second row one win test");
    }

    public void rowWinThreeTest(){
        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{1,1,0},{1,1,0},{1,1,0}}; // FAIL ---> {{1,1,1},{1,1,0},{1,1,0}}
        checkWinResultTest(ticTacToe.isWinPositionForVerticals(arr,0),"Third row one win test");
    }


}
