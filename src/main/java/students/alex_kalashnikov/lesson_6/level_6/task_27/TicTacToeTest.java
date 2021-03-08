package students.alex_kalashnikov.lesson_6.level_6.task_27;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest newTest = new TicTacToeTest();
        newTest.createFieldTest();

    }

    public void createFieldTest() {
        int[][] expectedResult = new int[3][3];
        for (int i = 0; i < expectedResult.length; i++) {
            for (int j = 0; j < 3; j++) {
                expectedResult[i][j] = -1;
            }
        }
        TicTacToe test = new TicTacToe();
        if (Arrays.deepEquals(expectedResult,test.createField())) {
            System.out.println("createFieldTest is OK!");
        }
        else {
            System.out.println("createFieldTest is FAILED!");
        }
    }

}
