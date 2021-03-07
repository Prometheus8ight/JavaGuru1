package students.julija_katukova.lesson_6.level_5.task_24;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.winCombination11(new int[][]{{0, 0, -1}, {-1, 0, -1}, {-1, -1, 0}}, 0);
        ticTacToeTest.winCombination12(new int[][]{{1, 0, -1}, {0, 1, -1}, {-1, 0, 1}}, 1);
        ticTacToeTest.winCombination13(new int[][]{{1, 0, -1}, {0, -1, -1}, {-1, 0, 1}}, 1);
        ticTacToeTest.winCombination21(new int[][]{{1, 1, 0}, {0, 0, -1}, {0, 0, 1}}, 0);
        ticTacToeTest.winCombination22(new int[][]{{1, -1, 1}, {0, 1, -1}, {1, 0, 0}}, 1);
        ticTacToeTest.winCombination23(new int[][]{{-1, -1, -1}, {-1, 0, -1}, {-1, -1, -1}}, 0);
    }

    public void winCombination11 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        check(realResult, true, "Win Combination Test11");
    }

    public void winCombination12 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        check(realResult, true, "Win Combination Test12");
    }

    public void winCombination13 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        check(realResult, false, "Win Combination Test13");
    }

    public void winCombination21 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        check(realResult, true, "Win Combination Test21");
    }

    public void winCombination22 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        check(realResult, true, "Win Combination Test22");
    }

    public void winCombination23 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForDiagonals(field, playerToCheck);
        check(realResult, false, "Win Combination Test23");
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
