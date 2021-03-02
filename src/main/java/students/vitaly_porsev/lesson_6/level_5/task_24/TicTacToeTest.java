package students.vitaly_porsev.lesson_6.level_5.task_24;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest method = new TicTacToeTest();
        method.allTests();

    }

    void allTests() {
        TicTacToeTest method = new TicTacToeTest();
        method.diagonalsLine1Test();
        method.diagonalsLine2Test();
        method.diagonalsLineFalseTest();
    }

    void diagonalsLine1Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {0, -1, 0},
                {0, 0, 1},
                {1, 1, 0}};
        checkResult(method.isWinPositionForDiagonals(array, 0), "diagonalsLine1Test");
    }

    void diagonalsLine2Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {-1, -1, 0},
                {0, 0, 1},
                {0, 1, 0}};
        checkResult(method.isWinPositionForDiagonals(array, 0), "diagonalsLine2Test");
    }

    void diagonalsLineFalseTest() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {0, -1, 0},
                {0, -1, 1},
                {1, 1, 0}};
        checkFalseResult(method.isWinPositionForDiagonals(array, 0), "diagonalsLineFalseTest");
    }

    void checkResult(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkFalseResult(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
