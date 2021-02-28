package students.kate_br.lesson_6.level_5.tak_23;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.isWinTest(new int[][]{{-1, 0, 1}, {1, 1, -1}, {0, 0, 0}}, 0);
        test.isWinTest2(new int[][]{{1, 0, -1}, {1, 1, 1}, {0, 0, -1}}, 1);
        test.isFailTest(new int[][]{{1, 1, 1}, {0, 0, -1}, {0, -1, 1}}, 0);
        test.isFailTest2(new int[][]{{-1, 1, 0}, {0, 0, 0}, {-1, 1, 1}}, 1);
    }

    public void isWinTest(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkVerticalsPosition(field, playerToCheck);
        checkTestResult(realResult, "Is win test");

    }

    public void isWinTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkVerticalsPosition(field, playerToCheck);
        checkTestResult(realResult, "Is win test 2");


    }

    public void isFailTest(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkVerticalsPosition(field, playerToCheck);
        checkTestResult(realResult, "Is fail test");

    }

    public void isFailTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkVerticalsPosition(field, playerToCheck);
        checkTestResult(realResult, " Is fail test 2");


    }

    private void checkTestResult(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }

    }
}
