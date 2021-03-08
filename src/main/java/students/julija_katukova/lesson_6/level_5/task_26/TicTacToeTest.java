package students.julija_katukova.lesson_6.level_5.task_26;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.drawPosition1(new int[][]{{-1, -1, -1}, {1, 1, 1}, {-1, -1, 0}});
        ticTacToeTest.drawPosition2(new int[][]{{1, 0, 1}, {0, 0, 1}, {1, 1, 0}});
        ticTacToeTest.drawPosition3(new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}});
    }

    public void drawPosition1 (int[][] field) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(field);
        check(realResult, false, "Draw Position Test1");
    }

    public void drawPosition2 (int[][] field) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(field);
        check(realResult, true, "Draw Position Test2");
    }

    public void drawPosition3 (int[][] field) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isDrawPosition(field);
        check(realResult, false, "Draw Position Test3");
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
