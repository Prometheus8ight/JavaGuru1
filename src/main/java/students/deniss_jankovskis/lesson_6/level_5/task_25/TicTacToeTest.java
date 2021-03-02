package students.deniss_jankovskis.lesson_6.level_5.task_25;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.horizontalPositionTest1(new int[][]{{1, 0, 1}, {0, 1, -1}, {-1, 0, 1}}, 1);
        test.horizontalPositionTest2(new int[][]{{-1, 0, 1}, {1, 0, 1}, {0, 1, 0}}, 0);
        test.horizontalPositionTest3(new int[][]{{0, 1, 0}, {1, 1, -1}, {1, 0, 1}}, 1);
        test.verticalPositionTest1(new int[][]{{0, 0, 1}, {1, 1, 0}, {1, 1, 0}}, 1);
        test.verticalPositionTest2(new int[][]{{1, 0, -1}, {0, 0, 1}, {-1, 0, 1}}, 0);
        test.verticalPositionTest3(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, -1}}, 0);
        test.diagonalPositionTest1(new int[][]{{1, 0, 1}, {0, -1, 0}, {1, -1, 0}}, 1);
        test.diagonalPositionTest2(new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 1, 1}}, 0);
        test.diagonalPositionTest3(new int[][]{{0, 0, 0}, {0, 1, -1}, {1, 1, 0}}, 1);
    }

    public void horizontalPositionTest1(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Position Test 1");
    }

    public void horizontalPositionTest2(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Position Test 2");
    }

    public void horizontalPositionTest3(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Position Test 3");
    }

    public void verticalPositionTest1(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Vertical Position Test 1");
    }

    public void verticalPositionTest2(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Vertical Position Test 2");
    }

    public void verticalPositionTest3(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Vertical Position Test 3");
    }

    public void diagonalPositionTest1(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Diagonal Position Test 1");
    }

    public void diagonalPositionTest2(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Diagonal Position Test 2");
    }

    public void diagonalPositionTest3(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        checkTestResult(realResult, "Diagonal Position Test 3");
    }

    private void checkTestResult(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }


}

