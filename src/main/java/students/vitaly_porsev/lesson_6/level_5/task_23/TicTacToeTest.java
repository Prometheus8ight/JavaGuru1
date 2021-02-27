package students.vitaly_porsev.lesson_6.level_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest method = new TicTacToeTest();
        method.trueTests();
        method.falseTests();
    }


    void trueTests() {
        TicTacToeTest method = new TicTacToeTest();
        method.verticalLine1Test();
        method.verticalLine2Test();
        method.verticalLine3Test();
    }

    void falseTests() {
        TicTacToeTest method = new TicTacToeTest();
        method.verticalFalseTest1();
        method.verticalFalseTest2();
        method.verticalFalseTest3();
    }


    void verticalLine1Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {0, -1, 0},
                {0, -1, 1},
                {0, 1, -1}};
        checkResult(method.isWinPositionForVerticals(array, 0), "verticalLine1Test");
    }

    void verticalLine2Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 0, 0},
                {1, 0, 1},
                {-1, 0, -1}};
        checkResult(method.isWinPositionForVerticals(array, 0), "verticalLine2Test");
    }

    void verticalLine3Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, -1, 0},
                {0, -1, 0},
                {0, 1, 0}};
        checkResult(method.isWinPositionForVerticals(array, 0), "verticalLine3Test");
    }

    void verticalFalseTest1() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, -1, 0},
                {0, -1, -1},
                {0, 1, 0}};
        checkFalseResult(method.isWinPositionForVerticals(array, 0), "verticalFalseTest1");
    }

    void verticalFalseTest2() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 0, 0},
                {1, -1, -1},
                {-1, 1, 0}};
        checkFalseResult(method.isWinPositionForVerticals(array, 0), "verticalFalseTest2");
    }

    void verticalFalseTest3() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {0, -1, 0},
                {-1, -1, -1},
                {0, 1, 1}};
        checkFalseResult(method.isWinPositionForVerticals(array, 0), "verticalFalseTest3");
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
