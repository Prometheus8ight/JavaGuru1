package students.deniss_jankovskis.lesson_6.level_5.task_22;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winHorizontalTest1(new int[][]{{1, 1, 1}, {-1, -1, -1}, {0, 0, 0}}, 0);
        test.winHorizontalTest2(new int[][]{{0, 1, 0}, {-1, 0, 1}, {1, 1, -1}}, 1);
        test.winHorizontalTest3(new int[][]{{0, 0, 0}, {1, 1, -1}, {1, -1, -1}}, 0);
        test.lostHorizontalTest1(new int[][]{{-1, -1, -1}, {0, 0, 0}, {1, 1, 1}}, 1);
        test.lostHorizontalTest2(new int[][]{{1, 0, 0}, {1, 0, 1}, {-1, -1, 1}}, 0);
        test.lostHorizontalTest3(new int[][]{{0, 0, 0}, {-1, -1, -1}, {1, 1, 1}}, 1);

    }

    public void winHorizontalTest1(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Win 1");
    }

    public void winHorizontalTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Win 2");
    }

    public void winHorizontalTest3(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Win 3");
    }

    public void lostHorizontalTest1(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Lost 1");
    }

    public void lostHorizontalTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Lost 2");
    }

    public void lostHorizontalTest3(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Lost 3");
    }


    public void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }

}
