package students.kate_br.lesson_6.level_5.task_25;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.horizontalFirstTest(new int[][]{{1, 1, 1}, {0, 1, -1}, {-1, 0, 0}}, 1);
        test.horizontalSecondTest(new int[][]{{1, 0, -1}, {0, -1, 1}, {0, 0, 0}}, 0);
        test.horizontalFailTest(new int[][]{{0, 1, -1}, {0, -1, -1}, {0, 0, 1}}, 1);
        test.verticalFirstTest(new int[][]{{1, 0, -1}, {1, 1, 0}, {1, -1, -1}}, 1);
        test.verticalSecondTest(new int[][]{{-1, 0, -1}, {1, 0, 0}, {-1, 0, 1}}, 0);
        test.verticalFailTest(new int[][]{{0, 1, -1}, {1, 1, 0}, {1, -1, -1}}, 0);
        test.diagonalLeftTest(new int[][]{{1, 0, -1}, {0, 1, 0}, {-1, -1, 1}}, 1);
        test.diagonalRightTest(new int[][]{{1, -1, 0}, {0, 0, 1}, {0, -1, 1}}, 0);
        test.diagonalFailTest(new int[][]{{1, 0, 0}, {0, -1, -1}, {1, -1, 0}}, 1);
    }

    public void horizontalFirstTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "First horizontal test");
    }

    public void horizontalSecondTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Second horizontal Test");
    }

    public void horizontalFailTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Fail horizontal test");
    }

    public void verticalFirstTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "First vertical test");
    }

    public void verticalSecondTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Second verticalTest");
    }

    public void verticalFailTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Fail vertical test");
    }

    public void diagonalLeftTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Left diagonal test");
    }

    public void diagonalRightTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Right diagonal test");
    }

    public void diagonalFailTest(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Fail diagonal test");
    }

    private void checkTestResult(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }

}
