package students.rodion_afanasjev.lesson_6.level_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.firstColumnTrueTest();
        ticTacToeTest.secondColumnTrueTest();
        ticTacToeTest.thirdColumnTrueTest();
        ticTacToeTest.firstColumnFalseTest();
        ticTacToeTest.secondColumnFalseTest();
        ticTacToeTest.thirdColumnFalseTest();

    }

    void firstColumnTrueTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{1, -1, -1}, {1, -1, -1}, {1, -1, -1}};
        condition(ticTacToe.isWinPositionForVerticals(array, 1), "firstColumnTrueTest");
    }

    void secondColumnTrueTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}};
        condition(ticTacToe.isWinPositionForVerticals(array, 1), "secondColumnTrueTest");
    }

    void thirdColumnTrueTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, 0}, {-1, -1, 0}, {-1, -1, 0}};
        condition(ticTacToe.isWinPositionForVerticals(array, 0), "thirdColumnTrueTest");
    }

    void firstColumnFalseTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{1, -1, -1}, {1, -1, -1}, {-1, -1, -1}};
        condition(!ticTacToe.isWinPositionForVerticals(array, 1), "firstColumnFalseTest");
    }

    void secondColumnFalseTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, 1, -1}, {-1, 1, -1}, {1, -1, -1}};
        condition(!ticTacToe.isWinPositionForVerticals(array, 1), "secondColumnFalseTest");
    }

    void thirdColumnFalseTest() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] array = {{-1, -1, 0}, {-1, -1, 0}, {-1, 0, -1}};
        condition(!ticTacToe.isWinPositionForVerticals(array, 0), "thirdColumnFalseTest");
    }

    public void condition(boolean condition, String testName){
        if (condition){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}
