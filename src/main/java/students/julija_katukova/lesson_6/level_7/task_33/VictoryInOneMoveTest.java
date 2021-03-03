package students.julija_katukova.lesson_6.level_7.task_33;

import java.util.Arrays;

class VictoryInOneMoveTest {

    public static void main(String[] args) {
        VictoryInOneMoveTest victoryInOneMoveTest = new VictoryInOneMoveTest();
        /*victoryInOneMoveTest.ForHorizontals1(new int[][]{{0, 0, -1}, {-1, -1, -1}, {-1, -1, -1}}, 0);
        victoryInOneMoveTest.ForHorizontals2(new int[][]{{0, -1, 1}, {0, -1, 1}, {-1, 1, 1}}, 1);
        victoryInOneMoveTest.ForHorizontals3(new int[][]{{0, -1, -1}, {1, -1, -1}, {-1, 0, 1}}, 1);
        victoryInOneMoveTest.ForVerticals1(new int[][]{{0, 0, -1}, {-1, 1, -1}, {-1, 0, -1}}, 0);
        victoryInOneMoveTest.ForVerticals2(new int[][]{{0, 1, 1}, {0, 0, -1}, {0, -1, 1}}, 1);
        victoryInOneMoveTest.ForVerticals3(new int[][]{{-1, -1, 1}, {0, 0, -1}, {1, -1, 0}}, 0);
        victoryInOneMoveTest.ForDiagonalsFromLeftCorner1(new int[][]{{-1, -1, 1}, {0, 0, -1}, {1, -1, 0}}, 0);
        victoryInOneMoveTest.ForDiagonalsFromLeftCorner2(new int[][]{{-1, -1, 1}, {0, 0, -1}, {1, -1, 1}}, 1);
        victoryInOneMoveTest.ForDiagonalsFromRightCorner1(new int[][]{{-1, -1, 0}, {0, 0, -1}, {1, -1, 1}}, 0);
        victoryInOneMoveTest.ForDiagonalsFromRightCorner2(new int[][]{{-1, -1, 0}, {0, 0, -1}, {1, -1, 1}}, 1);
        victoryInOneMoveTest.ForDiagonals1(new int[][]{{0, -1, 1}, {0, 0, -1}, {1, -1, -1}}, 0);
        victoryInOneMoveTest.ForDiagonals2(new int[][]{{-1, -1, 0}, {0, 0, -1}, {1, -1, 1}}, 1);
        victoryInOneMoveTest.ForHorizontals21(new int[][]{{0, -1, -1}, {0, -1, 0}, {-1, -1, -1}}, 0);
        victoryInOneMoveTest.ForHorizontals22(new int[][]{{0, -1, -1}, {0, -1, 0}, {-1, -1, -1}}, 1);
        victoryInOneMoveTest.ForVerticals21(new int[][]{{0, -1, 1}, {0, -1, -1}, {-1, -1, 1}}, 1);
        victoryInOneMoveTest.ForVerticals22(new int[][]{{0, -1, 1}, {1, -1, 0}, {-1, -1, 1}}, 0);
        victoryInOneMoveTest.ForDiagonals21(new int[][]{{0, -1, 1}, {1, -1, 0}, {-1, -1, 0}}, 0);
        victoryInOneMoveTest.ForDiagonals22(new int[][]{{0, -1, 1}, {1, -1, 0}, {-1, -1, 0}}, 1);
        victoryInOneMoveTest.ForVictoryPosition1(new int[][]{{0, -1, 0}, {-1, 1, -1}, {0, -1, 1}}, 0);
        victoryInOneMoveTest.ForVictoryPosition2(new int[][]{{0, 1, 0}, {-1, 0, -1}, {1, -1, -1}}, 1);
        */
        victoryInOneMoveTest.ForVictoryInOneMove1(new int[][]{{0, 0, -1}, {1, -1, -1}, {-1, 1, -1}}, 0);


    }

    public void ForHorizontals1(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, true, "For Horizontals Test1");
    }

    public void ForHorizontals2(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, true, "For Horizontals Test2");
    }

    public void ForHorizontals3(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, false, "For Horizontals Test3");
    }

    public void ForVerticals1(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, true, "For Verticals Test1");
    }

    public void ForVerticals2(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, true, "For Verticals Test2");
    }

    public void ForVerticals3(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, false, "For Verticals Test3");
    }

    public void ForDiagonalsFromLeftCorner1(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromLeftCorner(field, playerToCheck);
        check(realResult, true, "For Diagonals From Left Corner Test1");
    }

    public void ForDiagonalsFromLeftCorner2(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromLeftCorner(field, playerToCheck);
        check(realResult, false, "For Diagonals From Left Corner Test2");
    }

    public void ForDiagonalsFromRightCorner1(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromRightCorner(field, playerToCheck);
        check(realResult, true, "For Diagonals From Right Corner Test1");
    }

    public void ForDiagonalsFromRightCorner2(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromRightCorner(field, playerToCheck);
        check(realResult, false, "For Diagonals From Right Corner Test2");
    }

    public void ForDiagonals1(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForDiagonals(field, playerToCheck);
        check(realResult, true, "For Diagonals Test1");
    }

    public void ForDiagonals2(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForDiagonals(field, playerToCheck);
        check(realResult, false, "For Diagonals Test2");
    }

    public void ForHorizontals21(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, true, "For Horizontals Test21");
    }

    public void ForHorizontals22(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, false, "For Horizontals Test22");
    }

    public void ForVerticals21(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, true, "For Verticals Test21");
    }

    public void ForVerticals22(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, false, "For Verticals Test22");
    }

    public void ForDiagonals21(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMoveForDiagonals(field, playerToCheck);
        check(realResult, true, "For Diagonals Test21");
    }

    public void ForDiagonals22(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMoveForDiagonals(field, playerToCheck);
        check(realResult, false, "For Diagonals Test22");
    }

    public void ForVictoryPosition1(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMovePosition(field, playerToCheck);
        check(realResult, true, "For Victory Position Test1");
    }

    public void ForVictoryPosition2(int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.isVictoryInOneMovePosition(field, playerToCheck);
        check(realResult, false, "For Victory Position Test2");
    }

    public void ForVictoryInOneMove1 (int[][] field, int playerToCheck) {
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        System.out.println(Arrays.deepToString(field));
        victoryInOneMove.victoryInOneMove(field, playerToCheck);
        System.out.println(Arrays.deepToString(field));
        check2(field, new int[][]{{0, 0, 0}, {1, -1, -1}, {-1, 1, -1}},"For Victory In One Move Test1" );
    }




    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void check2(int[][] realResult, int[][] expectedResult, String testName) {
        if (Arrays.deepEquals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
