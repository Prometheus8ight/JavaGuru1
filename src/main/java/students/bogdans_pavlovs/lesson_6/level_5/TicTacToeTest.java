package students.bogdans_pavlovs.lesson_6.level_5;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToeTest test = new TicTacToeTest();

        //Horizontal Win Tests
        test.HorizontalTest1();
        test.HorizontalTest2();
        test.HorizontalTest3();
        test.HorizontalTest4();
        test.HorizontalTest5();
        test.HorizontalTest6();
        test.HorizontalFailTest();

        //Vertical Win Tests
        test.VerticalTest1();
        test.VerticalTest2();
        test.VerticalTest3();
        test.VerticalTest4();
        test.VerticalTest5();
        test.VerticalTest6();
        test.VerticalFailTest();

        //Diagonal Win Test
        test.DiagonalTest1();
        test.DiagonalTest2();
        test.DiagonalFailTest();

        //Is Winning Test
        test.isWinPositionTest();
        test.isWinPositionFailTest();

        //Is Draw Test
        test.isDrawPositionTest();
        test.isDrawPositionFailTest1();
        test.isDrawPositionFailTest2();



    }


    public void HorizontalTest1(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{1, 1, 1}, {0, -1, 0}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 1), "Horizontal TEST 1" );

    }

    public void HorizontalTest2(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {1, 1, 1}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 1), "Horizontal TEST 2" );

    }

    public void HorizontalTest3(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {-1, -1, 1}, {1, 1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 1), "Horizontal TEST 3" );

    }

    public void HorizontalTest4(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, 0, 0}, {0, -1, 0}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal TEST 4" );

    }

    public void HorizontalTest5(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {0, 0, 0}, {-1, -1, 1}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal TEST 5" );

    }

    public void HorizontalTest6(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{0, -1, 0}, {-1, -1, 1}, {0, 0, 0}};

        check(ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal TEST 6" );

    }

    public void HorizontalFailTest(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};

        check(!ticTacToe.isWinPositionForHorizontals(arr, 0), "Horizontal FAIL TEST" );

    }

    public void VerticalTest1(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, -1, 1},
                {1, -1, 0},
                {1, -1, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 1), "Vertical TEST 1" );

    }

    public void VerticalTest2(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, 1, 0},
                {0, 1, 1},
                {-1, 1, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 1), "Vertical TEST 2" );

    }

    public void VerticalTest3(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 1},
                {-1, -1, 1},
                {1, 0, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 1), "Vertical TEST 3" );

    }

    public void VerticalTest4(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, 1, 0},
                {0, -1, 0},
                {0, -1, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical TEST 4" );

    }

    public void VerticalTest5(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, 0, 0},
                {0, 0, 1},
                {-1, 0, 1}};

        check(ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical TEST 5" );

    }

    public void VerticalTest6(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 0},
                {-1, -1, 0},
                {0, 1, 0}};

        check(ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical TEST 6" );

    }

    public void VerticalFailTest(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, -1, 1},
                {1, -1, 1},
                {1, -1, 1}};

        check(!ticTacToe.isWinPositionForVerticals(arr, 0), "Vertical FAIL TEST" );

    }

    public void DiagonalTest1(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {1, 0, 1},
                {0, 1, 0},
                {-1, -1, 1}};

        check(ticTacToe.isWinPositionForDiagonals(arr, 1), "Diagonal TEST 1" );

    }

    public void DiagonalTest2(){

        TicTacToe ticTacToe = new TicTacToe();
        int[][] arr = {
                {0, -1, 0},
                {1, 0, 1},
                {-1, -1, 0}};

        check(ticTacToe.isWinPositionForDiagonals(arr, 0), "Diagonal TEST 2" );

    }

    public void DiagonalFailTest(){

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
