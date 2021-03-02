package students.deniss_jankovskis.lesson_6.level_5.task_24;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.leftDiagonalTest1(new int[][]{{0, 0, -1}, {0, -1, 0}, {-1, 1, 1}}, 1);
        test.leftDiagonalTest2(new int[][]{{0, 1, 1}, {1, 0, -1}, {1, 1, 0}}, 0);
        test.leftDiagonalTest3(new int[][]{{1, 1, -1}, {0, 0, 1}, {0, -1, 0}}, 0);
        test.rightDiagonalTest1(new int[][]{{-1, -1, 1}, {0, 1, -1}, {0, -1, 0}}, 1);
        test.rightDiagonalTest2(new int[][]{{1, 0, 0}, {-1, 0, 0}, {1, 1, -1}}, 0);
        test.rightDiagonalTest3(new int[][]{{1, -1, 1}, {0, 0, 1}, {1, -1, -1}}, 0);
    }

    public void leftDiagonalTest1(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForDiagonals(field, playerToCheck);
        checkTestResult(realResult, "Left Diagonal Test 1");
    }

    public void leftDiagonalTest2(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForDiagonals(field, playerToCheck);
        checkTestResult(realResult, "Left Diagonal Test 2");
    }

    public void leftDiagonalTest3(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForDiagonals(field, playerToCheck);
        checkTestResult(realResult, "Left Diagonal Test 3");
    }

    public void rightDiagonalTest1(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForDiagonals(field, playerToCheck);
        checkTestResult(realResult, "Right Diagonal Test 1");
    }

    public void rightDiagonalTest2(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForDiagonals(field, playerToCheck);
        checkTestResult(realResult, "Right Diagonal Test 2");
    }

    public void rightDiagonalTest3(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForDiagonals(field, playerToCheck);
        checkTestResult(realResult, "Right Diagonal Test 3");
    }

    private void checkTestResult(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }


}



