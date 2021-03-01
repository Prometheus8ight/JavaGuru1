package students.deniss_jankovskis.lesson_6.level_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winHorizontalTest1(new int[][]{{1, 0, 1}, {1, 1, 0}, {0, 0, 0}}, 0);
        test.winHorizontalTest2(new int[][]{{0, 1, -1}, {-1, -1, 0}, {1, 0, 0}}, 1);
        test.lostHorizontalTest(new int[][]{{1, 0, 0}, {-1, 1, 1}, {1, 0, 1}}, 0);
        test.lostHorizontalTest2(new int[][]{{-1, 1, 0}, {1, 0, -1}, {1, 1, 1}}, 1);

    }

    public void winHorizontalTest1(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Win");
    }

    public void winHorizontalTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Win 2");
    }

    public void lostHorizontalTest(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Lost");
    }

    public void lostHorizontalTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Lost 2");
    }


    private void checkTestResult(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }



}