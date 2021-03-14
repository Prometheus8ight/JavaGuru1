package students.deniss_jankovskis.lesson_6.level_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();
        test.winVerticalsTest1(new int[][]{{0, -1, -1}, {0, -1, 1}, {0, 0, -1}}, 0);
        test.winVerticalsTest2(new int[][]{{1, 0, 1}, {1, 0, 1}, {-1, 0, -1}}, 0);
        test.winVerticalsTest3(new int[][]{{1, 0, 1}, {1, 0, 1}, {1, 0, -1}}, 0);
        test.lostVerticalsTestTest1(new int[][]{{1, 0, 0}, {1, 0, 0}, {-1, 0, -1}}, 0);
        test.lostVerticalsTestTest2(new int[][]{{0, 1, -1}, {0, -1, 1}, {0, 1, -1}}, 0);
        test.lostVerticalsTestTest2(new int[][]{{0, 0, -1}, {0, -1, 0}, {0, 1, -1}}, 0);

    }

    public void winVerticalsTest1(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Vertical Test Win 1");
    }

    public void winVerticalsTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Vertical Test Win 2");
    }

    public void winVerticalsTest3(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Vertical Test Win 3");
    }

    public void lostVerticalsTestTest1(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Vertical Test Lost 1");
    }

    public void lostVerticalsTestTest2(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Vertical Test Lost 2");
    }

    public void lostVerticalsTestTest3(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        checkTestResult(realResult, "Vertical Test Lost 3");
    }


    public void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }


}