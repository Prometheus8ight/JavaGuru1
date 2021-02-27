package students.vitaly_porsev.lesson_6.level_5.task_26;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest method = new TicTacToeTest();
        method.isDrawTestTrue();
        method.isDrawTestFalse();
        method.isDrawTestFalseMinus1();
    }

    void isDrawTestTrue() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 1, 0},
                {0, 0, 1},
                {1, 0, 1}
        };
        checkResult(method.isDrawPosition(array), "isDrawTestTrue");
    }

    void isDrawTestFalse() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 1}
        };
        checkFalseResult(method.isDrawPosition(array), "isDrawTestFalse");
    }

    void isDrawTestFalseMinus1() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {-1, 1, 0},
                {1, 0, -1},
                {0, 0, -1}
        };
        checkFalseResult(method.isDrawPosition(array), "isDrawTestFalseMinus1");
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
