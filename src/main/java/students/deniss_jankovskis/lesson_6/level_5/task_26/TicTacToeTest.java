package students.deniss_jankovskis.lesson_6.level_5.task_26;

public class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.isWinTest(new int[][]{{-1, 1, 0}, {1, 1, -1}, {1, 0, 1}});
        test.isDrawTest(new int[][]{{1, 0, 0}, {1, 0, 1}, {0, 1, 0}});
    }

    public void isDrawTest(int[][] field) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(field);
        checkTestResult(realResult, true, "Draw test");

    }

    public void isWinTest(int[][] field) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(field);
        checkTestResult(realResult, false, "Win test");
    }


    private void checkTestResult(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }
}

