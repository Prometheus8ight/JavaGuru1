package students.julija_katukova.lesson_6.level_5.task_23;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.winCombination1(new int[][]{{0, 0, -1}, {-1, 0, -1}, {-1, 0, -1}}, 0);
        ticTacToeTest.winCombination2(new int[][]{{0, 1, -1}, {0, 1, -1}, {0, -1, -1}}, 0);
        ticTacToeTest.winCombination3(new int[][]{{0, 1, 1}, {0, 0, 1}, {-1, -1, 1}}, 1);
        ticTacToeTest.winCombination4(new int[][]{{0, 1, 1}, {0, 0, 1}, {-1, -1, 0}}, 1);
    }

    public void winCombination1 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        check(realResult, true, "Win Combination Test1");
    }

    public void winCombination2 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        check(realResult, true, "Win Combination Test2");
    }

    public void winCombination3 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        check(realResult, true, "Win Combination Test3");
    }

    public void winCombination4 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForVerticals(field, playerToCheck);
        check(realResult, false, "Win Combination Test4");
    }

    public void check (boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
