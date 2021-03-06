package students.andrew_galashin.lesson_6.level_5.task_23;


class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest start = new TicTacToeTest();
        start.y1Test();
        start.y2Test();
        start.y3Test();
        start.y1FailTest();
        start.y2FailTest();
        start.y3FailTest();
    }


    void y1Test() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 0, 0}, {1, 0, 1}, {-1, 0, -1}};
        checkTrue(start.isWinPositionForVerticals(arr, 0), "y1Test");
    }

    void y2Test() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {0, -1, 1}, {0, 1, -1}};
        checkTrue(start.isWinPositionForVerticals(arr, 0), "y2Test");
    }

    void y3Test() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, -1, 0}, {0, 1, 0}, {0, 1, 0}};
        checkTrue(start.isWinPositionForVerticals(arr, 0), "y3Test");
    }

    void y1FailTest() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, -1, 0}, {0, -1, -1}, {0, 1, 0}};
        checkFail(start.isWinPositionForVerticals(arr, 0), "y1FailTest");
    }

    void y2FailTest() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 0, 0}, {-1, -1, -1}, {0, 1, 1}};
        checkFail(start.isWinPositionForVerticals(arr, 0), "y2FailTest");
    }

    void y3FailTest() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, -1, 0}, {0, 1, 1}, {0, -1, -0}};
        checkFail(start.isWinPositionForVerticals(arr, 0), "y3FailTest");
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

