package students.alex_kalashnikov.lesson_6.level_5.task_23;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForVerticalsTest1();
        test.isWinPositionForVerticalsTest2();
        test.isWinPositionForVerticalsTest3();
    }

    public void test(boolean realResult, boolean expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("WinPositionForVerticalsTest is OK!");
        } else {
            System.out.println("WinPositionForVerticalsTest is FAILED!");
        }
    }

    public void isWinPositionForVerticalsTest1() {
        boolean expectedResult = true;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 1;
        testArray[0][1] = 1;
        testArray[0][2] = 1;
        testArray[1][0] = 1;
        testArray[1][1] = 1;
        testArray[1][2] = -1;
        testArray[2][0] = 0;
        testArray[2][1] = 1;
        testArray[2][2] = 0;
        boolean realResult = test.isWinPositionForVerticals(testArray, 1);
        test(realResult, expectedResult);
    }

    public void isWinPositionForVerticalsTest2() {
        boolean expectedResult = true;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 0;
        testArray[0][1] = 1;
        testArray[0][2] = 1;
        testArray[1][0] = 0;
        testArray[1][1] = 1;
        testArray[1][2] = 1;
        testArray[2][0] = 0;
        testArray[2][1] = 1;
        testArray[2][2] = 0;
        boolean realResult = test.isWinPositionForVerticals(testArray, 0);
        test(realResult, expectedResult);
    }

    public void isWinPositionForVerticalsTest3() {
        boolean expectedResult = false;
        TicTacToe test = new TicTacToe();
        int[][] testArray = test.create(3);
        testArray[0][0] = 1;
        testArray[0][1] = 0;
        testArray[0][2] = 1;
        testArray[1][0] = 0;
        testArray[1][1] = 1;
        testArray[1][2] = 0;
        testArray[2][0] = 1;
        testArray[2][1] = 1;
        testArray[2][2] = 0;
        boolean realResult = test.isWinPositionForVerticals(testArray, 0);
        test(realResult, expectedResult);
    }

}