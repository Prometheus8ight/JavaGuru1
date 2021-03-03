package students.julija_katukova.lesson_6.level_7.task_33;

class VictoryInOneMoveTest {

    public static void main(String[] args) {
        VictoryInOneMoveTest victoryInOneMoveTest = new VictoryInOneMoveTest();
        victoryInOneMoveTest.ForHorizontals1( new int[][]{{0, 0, -1}, {-1, -1, -1}, {-1, -1, -1}}, 0);
        victoryInOneMoveTest.ForHorizontals2( new int[][]{{0, -1, 1}, {0, -1, 1}, {-1, 1, 1}}, 1);
        victoryInOneMoveTest.ForHorizontals3(new int[][]{{0, -1, -1}, {1, -1, -1}, {-1, 0, 1}}, 1);
        victoryInOneMoveTest.ForVerticals1(new int[][]{{0, 0, -1}, {-1, 1, -1}, {-1, 0, -1}}, 0);
        victoryInOneMoveTest.ForVerticals2(new int[][]{{0, 1, 1}, {0, 0, -1}, {0, -1, 1}}, 1);
        victoryInOneMoveTest.ForVerticals3(new int[][]{{-1, -1, 1}, {0, 0, -1}, {1, -1, 0}}, 0);
        victoryInOneMoveTest.ForDiagonalsFromLeftCorner1(new int[][]{{-1, -1, 1}, {0, 0, -1}, {1, -1, 0}}, 0);
        victoryInOneMoveTest.ForDiagonalsFromLeftCorner2(new int[][]{{-1, -1, 1}, {0, 0, -1}, {1, -1, 1}}, 1);
        victoryInOneMoveTest.ForDiagonalsFromRightCorner1(new int[][]{{-1, -1, 0}, {0, 0, -1}, {1, -1, 1}}, 0);
        victoryInOneMoveTest.ForDiagonalsFromRightCorner2(new int[][]{{-1, -1, 0}, {0, 0, -1}, {1, -1, 1}}, 1);
    }

    public void ForHorizontals1 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, true,"For Horizontals Test1");
    }

    public void ForHorizontals2 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, true,"For Horizontals Test2");
    }

    public void ForHorizontals3 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForHorizontals(field, playerToCheck);
        check(realResult, false,"For Horizontals Test3");
    }

    public void ForVerticals1 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, true,"For Verticals Test1");
    }

    public void ForVerticals2 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, true,"For Verticals Test2");
    }

    public void ForVerticals3 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveForVerticals(field, playerToCheck);
        check(realResult, false,"For Verticals Test3");
    }

    public void ForDiagonalsFromLeftCorner1 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromLeftCorner(field, playerToCheck);
        check(realResult, true,"For Diagonals From Left Corner Test1");
    }

    public void ForDiagonalsFromLeftCorner2 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromLeftCorner(field, playerToCheck);
        check(realResult, false,"For Diagonals From Left Corner Test2");
    }

    public void ForDiagonalsFromRightCorner1 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromRightCorner(field, playerToCheck);
        check(realResult, true,"For Diagonals From Right Corner Test1");
    }

    public void ForDiagonalsFromRightCorner2 (int[][] field, int playerToCheck){
        VictoryInOneMove victoryInOneMove = new VictoryInOneMove();
        boolean realResult = victoryInOneMove.checkVictoryInOneMoveFromRightCorner(field, playerToCheck);
        check(realResult, false,"For Diagonals From Right Corner Test2");
    }








    public void check (boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
