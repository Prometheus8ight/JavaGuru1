package students.deniss_jankovskis.lesson_6.level_6.task_27;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.createField1();
        ticTacToeTest.createField2();
        ticTacToeTest.createField3();
    }

    public void createField1() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] realResult = ticTacToe.createField();
        checkTestResult(realResult, new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}, "Create Field Test 1");
    }

    public void createField2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] realResult = ticTacToe.createField();
        checkTestResult(realResult, new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}, "Create Field Test 2");
    }

    public void createField3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] realResult = ticTacToe.createField();
        checkTestResult(realResult, new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}, "Create Field Test 3");
    }

    public void checkTestResult(int[][] realResult, int[][] expectedResult, String testName) {
        if (Arrays.deepEquals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}