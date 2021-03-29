package students.andrew_galashin.lesson_6.level_5.task_26;


class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest start = new TicTacToeTest();
        start.testTrue();
        start.testFalse();
    }

    void testTrue() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 1, 0},
                {0, 0, 1},
                {1, 0, 1}};
        checkTrue(start.isDrawPosition(arr), "testTrue");
    }

    void testFalse() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 1, 0},
                {0, 0, 1},
                {0, 1, 1}};
        checkFail(start.isDrawPosition(arr), "testFail");
    }

    void checkTrue(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

    void checkFail(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}