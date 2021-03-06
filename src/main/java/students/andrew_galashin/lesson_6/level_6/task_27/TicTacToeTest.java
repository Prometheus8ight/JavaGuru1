package students.andrew_galashin.lesson_6.level_6.task_27;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest start = new TicTacToeTest();
        start.testTrue();
        start.testFalse();
    }

    void testTrue() {
        TicTacToe start = new TicTacToe();
        int[][] x = start.createField();
        checkTrue(start.field(x), "testTrue");
    }

    void testFalse() {
        TicTacToe start = new TicTacToe();
        int[][] x = {{1, 1, 1}, {1, 1, 0}, {1, 1, 1}};
        checkFalse(start.field(x), "testFalse");
    }


    void checkTrue(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

    void checkFalse(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}
