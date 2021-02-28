package students.rodion_afanasjev.lesson_6.level_5.task_22;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.horizontalWinConditionTest(new int[][]{{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}}, 0);
        ticTacToeTest.horizontalWinConditionTest(new int[][]{{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}}, 1);

    }

    public void horizontalWinConditionTest(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean realResult = ticTacToe.isWinPositionForHorizontals(field, playerToCheck);
        condition(realResult, "horizontalWinConditionTest");
    }

    public void condition(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }
}
