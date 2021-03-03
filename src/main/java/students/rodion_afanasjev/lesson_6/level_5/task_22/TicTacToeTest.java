package students.rodion_afanasjev.lesson_6.level_5.task_22;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.firstLaneTrueTest();
        ticTacToeTest.secondLaneTrueTest();
        ticTacToeTest.thirdLaneTrueTest();
        ticTacToeTest.firstLaneFalseTest();
        ticTacToeTest.secondLaneFalseTest();
        ticTacToeTest.thirdLaneFalseTest();

    }

    void firstLaneTrueTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        condition(ticTacToe.isWinPositionForHorizontals(array, 0), "firstLaneTrueTest");
    }

    void secondLaneTrueTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};
        condition(ticTacToe.isWinPositionForHorizontals(array, 0), "secondLaneTrueTest");
    }

    void thirdLaneTrueTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, 1}};
        condition(ticTacToe.isWinPositionForHorizontals(array, 1), "thirdLaneTrueTest");
    }

    void firstLaneFalseTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{1, 1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        condition(!ticTacToe.isWinPositionForHorizontals(array, 1), "firstLaneFalseTest");
    }

    void secondLaneFalseTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {1, -1, 1}, {1, -1, -1}};
        condition(!ticTacToe.isWinPositionForHorizontals(array, 1), "secondLaneFalseTest");
    }

    void thirdLaneFalseTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {-1, -1, -1}, {0, 0, 1}};
        condition(!ticTacToe.isWinPositionForHorizontals(array, 0), "thirdLaneFalseTest");
    }

    void condition(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }
}
