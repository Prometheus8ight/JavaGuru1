package students.deniss_jankovskis.lesson_6.level_5.task_22;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winHorizontalTest(new int[][]{{0, 1, 0}, {-1, 0, -1}, {1, -1, -1}}, 0);
        test.lostHorizontalTest(new int[][]{{-1, 0, 0}, {1, 0, 1}, {-1, -1, 1}}, 1);

    }

    public void winHorizontalTest(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkForHorizontalPosition(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Win");
    }

    public void lostHorizontalTest(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.checkForHorizontalPosition(field, playerToCheck);
        checkTestResult(realResult, "Horizontal Test Lost");
    }


    private void checkTestResult(boolean condition, String testName) {

        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }

}
