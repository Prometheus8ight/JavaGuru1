package students.kate_br.lesson_6.level_5.task_22;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.isWinHorizontalTest(new int[][]{{0, 0, 0}, {1, 0, 1},{0, -1, -1}}, 0);
        test.isFailHorizontalTest(new int[][]{{-1,-1, 0}, {0, 0, 1}, {-1, -1, 1}}, 1);
    }

    public void isWinHorizontalTest(int[][] field, int playerToCheck){

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkHorizontalPosition(field, playerToCheck);
        checkTestResult(realResult, "Is Win Test");
    }

    public void isFailHorizontalTest(int[][] field, int playerToCheck){

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkHorizontalPosition(field, playerToCheck);
        checkTestResult(realResult, "Is Fail Test");
    }

    private void checkTestResult(boolean condition, String testName){

        if (condition){
            System.out.println(testName + ": Test OK");
        }else {
            System.out.println(testName + ": Test FAIL");
        }
    }
}
