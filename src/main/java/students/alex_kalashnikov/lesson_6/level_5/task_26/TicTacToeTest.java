package students.alex_kalashnikov.lesson_6.level_5.task_26;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isDrawPositionTest1();
        test.isDrawPositionTest2();
        test.isDrawPositionTest3();
    }

    public void test(boolean realResult, boolean expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("isDrawPositionTest is OK!");
        } else {
            System.out.println("isDrawPositionTest is FAILED!");
        }
    }

    public void isDrawPositionTest1() {
        boolean expectedResult = true;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 1;
        testArray[0][1] = 0;
        testArray[0][2] = 1;
        testArray[1][0] = 0;
        testArray[1][1] = 1;
        testArray[1][2] = 0;
        testArray[2][0] = 0;
        testArray[2][1] = 1;
        testArray[2][2] = 0;
        boolean realResult = test.isDrawPosition(testArray);
        test(realResult, expectedResult);
    }

    public void isDrawPositionTest2() {
        boolean expectedResult = true;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 1;
        testArray[0][1] = 1;
        testArray[0][2] = 0;
        testArray[1][0] = 0;
        testArray[1][1] = 1;
        testArray[1][2] = 1;
        testArray[2][0] = 1;
        testArray[2][1] = 0;
        testArray[2][2] = 0;
        boolean realResult = test.isDrawPosition(testArray);
        test(realResult, expectedResult);
    }

    public void isDrawPositionTest3() {
        boolean expectedResult = false;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 1;
        testArray[0][1] = 0;
        testArray[0][2] = 1;
        testArray[1][0] = 0;
        testArray[1][1] = 1;
        testArray[1][2] = 0;
        testArray[2][0] = 0;
        testArray[2][1] = -1;
        testArray[2][2] = 0;
        boolean realResult = test.isDrawPosition(testArray);
        test(realResult, expectedResult);
    }

}