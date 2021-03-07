package students.julija_katukova.lesson_6.level_5.task_25;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.winCombinationHorizontals1(new int[][]{{-1, -1, -1}, {1, 1, 1}, {-1, -1, 0}}, 1);
        ticTacToeTest.winCombinationHorizontals2(new int[][]{{-1, -1, -1}, {1, -1, 1}, {0, 0, 0}}, 0);
        ticTacToeTest.winCombinationHorizontals3(new int[][]{{-1, -1, -1}, {1, -1, 1}, {0, -1, 0}}, 0);
        ticTacToeTest.winCombinationVerticals1(new int[][]{{0, -1, -1}, {0, -1, 1}, {0, -1, 0}}, 0);
        ticTacToeTest.winCombinationVerticals2(new int[][]{{-1, -1, 1}, {0, -1, 1}, {-1, -1, 1}}, 1);
        ticTacToeTest.winCombinationVerticals3(new int[][]{{-1, -1, -1}, {0, -1, 1}, {-1, -1, -1}}, 0);
        ticTacToeTest.winCombinationDiagonals1(new int[][]{{1, -1, -1}, {0, 1, 1}, {-1, -1, 1}}, 1);
        ticTacToeTest.winCombinationDiagonals2(new int[][]{{1, -1, 0}, {-1, 0, 1}, {0, -1, 1}}, 0);
        ticTacToeTest.winCombinationDiagonals3(new int[][]{{-1, -1, -1}, {-1, -1, 1}, {-1, -1, -1}}, 1);
    }

    public void winCombinationHorizontals1 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, true, "Win Combination Horizontals Test1");
    }

    public void winCombinationHorizontals2 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, true, "Win Combination Horizontals Test2");
    }

    public void winCombinationHorizontals3 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, false, "Win Combination Horizontals Test3");
    }

    public void winCombinationVerticals1 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, true, "Win Combination Verticals Test1");
    }

    public void winCombinationVerticals2 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, true, "Win Combination Verticals Test2");
    }

    public void winCombinationVerticals3 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, false, "Win Combination Verticals Test3");
    }

    public void winCombinationDiagonals1 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, true, "Win Combination Diagonals Test1");
    }

    public void winCombinationDiagonals2 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, true, "Win Combination Diagonals Test2");
    }

    public void winCombinationDiagonals3 (int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPosition(field, playerToCheck);
        check(realResult, false, "Win Combination Diagonals Test3");
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
