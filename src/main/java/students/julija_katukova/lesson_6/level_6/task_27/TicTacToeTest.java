package students.julija_katukova.lesson_6.level_6.task_27;

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
        int[][] realResult = ticTacToe.createField(3);
        check(realResult, new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}, "Create Field Test1");
    }

    public void createField2() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] realResult = ticTacToe.createField(4);
        check(realResult, new int[][]{{-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}, {-1, -1, -1, -1}}, "Create Field Test2");
    }

    public void createField3() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] realResult = ticTacToe.createField(2);
        check(realResult, new int[][]{{-1, -1}, {-1, -1}}, "Create Field Test3");
    }

    public void check (int[][] realResult, int[][] expectedResult, String testName) {
        if (Arrays.deepEquals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
