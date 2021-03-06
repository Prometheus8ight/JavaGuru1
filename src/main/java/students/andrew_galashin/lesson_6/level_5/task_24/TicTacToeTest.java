package students.andrew_galashin.lesson_6.level_5.task_24;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest start = new TicTacToeTest();
        start.diagonaleTest1();
        start.diagonaleTest2();
        start.diagonaleFailTest();
    }


    void diagonaleTest1() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, -1, 0},
                {0, 0, 1},
                {1, 1, 0}};
        checkTrue(start.isWinPositionForDiagonals(arr, 0), "diagonalTest1");
    }

    void diagonaleTest2() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{-1, -1, 0}, {0, 0, 1}, {0, 1, 0}};
        checkTrue(start.isWinPositionForDiagonals(arr, 0), "diagonalTest2");
    }

    void diagonaleFailTest() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {0, -1, 1}, {1, 1, 0}};
        checkFail(start.isWinPositionForDiagonals(arr, 0), "diagonalFailTest");
    }


    void checkTrue(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + "Fail");
        }
    }

    void checkFail(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + "Fail");
        }
    }
}
