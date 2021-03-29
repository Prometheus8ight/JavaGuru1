package students.andrew_galashin.lesson_6.level_5.task_25;


class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest start = new TicTacToeTest();
        start.winTest1();
        start.winTest2();
        start.winTest3();
        start.winTest4();
        start.winTest5();
        start.winTest6();
        start.winFailTest1();
        start.winFailTest2();
    }


    void winTest1() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}};
        checkTrue(start.isWin(arr, 0), "winTest1");
    }

    void winTest2() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, -1, 0},
                {0, -1, 0},
                {0, -1, 0}};
        checkTrue(start.isWin(arr, 0), "winTest2");
    }

    void winTest3() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, 0, -1},
                {0, 0, -1},
                {0, 0, -1}};
        checkTrue(start.isWin(arr, 0), "winTest3");
    }

    void winTest4() {

        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 1, 1},
                {0, 0, 0},
                {0, 0, 0}};
        checkTrue(start.isWin(arr, 0), "winTest4");
    }


    void winTest5() {

        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, 1, 0},
                {1, 1, 1},
                {0, 1, 0}};
        checkTrue(start.isWin(arr, 1), "winTest5");
    }


    void winTest6() {

        TicTacToe start = new TicTacToe();
        int[][] arr = {{0, 0, 0},
                {0, 0, 0},
                {-1, -1, -1}};
        checkTrue(start.isWin(arr, 0), "winTest6");
    }

    void winFailTest1() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{1, 0, 0},
                {-1, -1, 1},
                {0, -1, 1}};
        checkFail(start.isWin(arr, 0), "winFailTest1");
    }

    void winFailTest2() {
        TicTacToe start = new TicTacToe();
        int[][] arr = {{-1, 1, -1},
                {0, 1, 0},
                {1, -1, 1}};
        checkFail(start.isWin(arr, 0), "winFailTest2");
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
