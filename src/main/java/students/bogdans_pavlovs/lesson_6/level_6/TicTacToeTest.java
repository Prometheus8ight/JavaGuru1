package students.bogdans_pavlovs.lesson_6.level_6;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();

        //Create Field Tests
        test.createFieldTest();

        //Horizontal Win Tests
        test.horizontalTest1();
        test.horizontalTest2();
        test.horizontalTest3();
        test.horizontalTest4();
        test.horizontalTest5();
        test.horizontalTest6();
        test.horizontalFailTest();

        //Vertical Win Tests
        test.verticalTest1();
        test.verticalTest2();
        test.verticalTest3();
        test.verticalTest4();
        test.verticalTest5();
        test.verticalTest6();
        test.verticalFailTest();

        //Diagonal Win Test
        test.diagonalTest1();
        test.diagonalTest2();
        test.diagonalFailTest();

        //Is Winning Test
        test.isWinPositionTest();
        test.isWinPositionFailTest();

        //Is Draw Test
        test.isDrawPositionTest();
        test.isDrawPositionFailTest1();
        test.isDrawPositionFailTest2();



    }

    public void createFieldTest() {

        TicTacToe ticTacToe = new TicTacToe();

        int[][] blankField = new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] createdFiled = ticTacToe.createField();

        checkField(createdFiled, blankField, "Create Field Test");

    }


    public void checkField(int[][] createdField, int[][] blankField, String testName){

        if (Arrays.deepEquals(createdField, blankField)) {

            System.out.println(testName + " = OK!");

        } else {

            System.out.println(testName + " = FAIL!");

        }

    }



    public void horizontalTest1(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{1, 1, 1}, {0, -1, 0}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 1), "Horizontal TEST 1" );

    }

    public void horizontalTest2(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {1, 1, 1}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 1), "Horizontal TEST 2" );

    }

    public void horizontalTest3(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {-1, -1, 1}, {1, 1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 1), "Horizontal TEST 3" );

    }

    public void horizontalTest4(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, 0, 0}, {0, -1, 0}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal TEST 4" );

    }

    public void horizontalTest5(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {0, 0, 0}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal TEST 5" );

    }

    public void horizontalTest6(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {-1, -1, 1}, {0, 0, 0}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal TEST 6" );

    }

    public void horizontalFailTest(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};

        check(!ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal FAIL TEST" );

    }

    public void verticalTest1(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, -1, 1},
                {1, -1, 0},
                {1, -1, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 1), "Vertical TEST 1" );

    }

    public void verticalTest2(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, 1, 0},
                {0, 1, 1},
                {-1, 1, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 1), "Vertical TEST 2" );

    }

    public void verticalTest3(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 1},
                {-1, -1, 1},
                {1, 0, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 1), "Vertical TEST 3" );

    }

    public void verticalTest4(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, 1, 0},
                {0, -1, 0},
                {0, -1, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical TEST 4" );

    }

    public void verticalTest5(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, 0, 0},
                {0, 0, 1},
                {-1, 0, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical TEST 5" );

    }

    public void verticalTest6(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 0},
                {-1, -1, 0},
                {0, 1, 0}};

        check(ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical TEST 6" );

    }

    public void verticalFailTest(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, -1, 1},
                {1, -1, 1},
                {1, -1, 1}};

        check(!ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical FAIL TEST" );

    }

    public void diagonalTest1(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, 0, 1},
                {0, 1, 0},
                {-1, -1, 1}};

        check(ticTacToe.isWinPositionForDiagonals(arr, 1), "Diagonal TEST 1" );

    }

    public void diagonalTest2(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 0},
                {1, 0, 1},
                {-1, -1, 0}};

        check(ticTacToe.isWinPositionForDiagonals(arr, 0), "Diagonal TEST 2" );

    }

    public void diagonalFailTest(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 0},
                {1, 1, 1},
                {1, 1, 1}};

        check(!ticTacToe.isWinPositionForDiagonals(arr, 1), "Diagonal FAIL TEST" );

    }

    public void isWinPositionTest(){

        TicTacToe ticTacToe = new TicTacToe();

        int[][] arr = {
                {1, -1, 0},
                {1, 1, 1},
                {0, 1, 0}};

        check(ticTacToe.isWinPosition(arr, 1), "Is Win TEST");


    }

    public void isWinPositionFailTest(){

        TicTacToe ticTacToe = new TicTacToe();

        int[][] arr = {
                {0, 1, 0},
                {0, 1, 0},
                {1, 0, 1}};

        check(!ticTacToe.isWinPosition(arr, 1), "Is Win FAIL TEST");


    }

    public void isDrawPositionTest(){

        TicTacToe ticTacToe = new TicTacToe();

        int[][] arr = {
                {1, 0, 1},
                {1, 0, 1},
                {0, 1, 0}};

        check(ticTacToe.isDrawPosition(arr), "Is Draw TEST");


    }

    public void isDrawPositionFailTest1(){

        TicTacToe ticTacToe = new TicTacToe();

        int[][] arr = {
                {1, 0, 1},
                {1, 1, 1},
                {0, 1, 0}};

        check(!ticTacToe.isDrawPosition(arr), "Is Draw FAIL TEST 1");


    }

    public void isDrawPositionFailTest2(){

        TicTacToe ticTacToe = new TicTacToe();

        int[][] arr = {
                {1, 0, 1},
                {1, -1, 1},
                {0, 1, 0}};

        check(!ticTacToe.isDrawPosition(arr), "Is Draw FAIL TEST 2");


    }

    void check (boolean isWin, String testName) {

        if (isWin) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

}
