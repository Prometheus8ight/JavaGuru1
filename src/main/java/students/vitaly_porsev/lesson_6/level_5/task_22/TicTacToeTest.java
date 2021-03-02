package students.vitaly_porsev.lesson_6.level_5.task_22;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest method = new TicTacToeTest();
        method.trueTests();
        method.falseTests();
    }

    void trueTests() {
        TicTacToeTest method = new TicTacToeTest();
        method.p1line1Test();
        method.p1line2Test();
        method.p1line3Test();
        method.p2line1Test();
        method.p2line2Test();
        method.p2line3Test();
    }

    void falseTests() {
        TicTacToeTest method = new TicTacToeTest();
        method.falseTest1();
        method.falseTest2();
        method.falseTest3();
    }

    void p1line1Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        checkResult(method.isWinPositionForHorizontals(array, 0), "p1line1Test");
    }

    void p1line2Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};
        checkResult(method.isWinPositionForHorizontals(array, 0), "p1line2Test");
    }

    void p1line3Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {-1, -1, -1}, {0, 0, 0}};
        checkResult(method.isWinPositionForHorizontals(array, 0), "p1line3Test");
    }

    void p2line1Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
        checkResult(method.isWinPositionForHorizontals(array, 1), "p2line1Test");
    }

    void p2line2Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};
        checkResult(method.isWinPositionForHorizontals(array, 1), "p2line2Test");
    }

    void p2line3Test() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, 1}};
        checkResult(method.isWinPositionForHorizontals(array, 1), "p2line3Test");
    }

    void falseTest1() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{-1, -1, 0}, {-1, 0, -1}, {1, 1, 0}};
        checkFalseResult(method.isWinPositionForHorizontals(array, 0), "falseTest1");
    }

    void falseTest2() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{1, 1, 0}, {-1, 0, -1}, {1, 1, 0}};
        checkFalseResult(method.isWinPositionForHorizontals(array, 1), "falseTest2");
    }

    void falseTest3() {
        TicTacToe method = new TicTacToe();
        int[][] array = {{-1, 1, 0}, {0, 0, -1}, {1, 1, 0}};
        checkFalseResult(method.isWinPositionForHorizontals(array, 0), "falseTest3");
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
