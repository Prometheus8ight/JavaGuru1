package students.kristine_paskevica.lesson_6.level_5;

class TicTacToeTest25 {

    public static void main(String[] args) {
        TicTacToeTest25 testi = new TicTacToeTest25();
        testi.kombHor1(new int[][]{{-1, -1, -1}, {1, 1, 1}, {-1, -1, 0}}, 1);
        testi.kombHor2(new int[][]{{-1, -1, -1}, {1, -1, 1}, {0, 0, 0}}, 0);
        testi.kombHor3(new int[][]{{-1, -1, -1}, {1, -1, 1}, {0, -1, 0}}, 0);
        testi.kombVert1(new int[][]{{0, -1, -1}, {0, -1, 1}, {0, -1, 0}}, 0);
        testi.kombVert2(new int[][]{{-1, -1, 1}, {0, -1, 1}, {-1, -1, 1}}, 1);
        testi.kombVert3(new int[][]{{-1, -1, -1}, {0, -1, 1}, {-1, -1, -1}}, 0);
        testi.kombDiag1(new int[][]{{1, -1, -1}, {0, 1, 1}, {-1, -1, 1}}, 1);
        testi.kombDiag2(new int[][]{{1, -1, 0}, {-1, 0, 1}, {0, -1, 1}}, 0);
        testi.kombDiag3(new int[][]{{-1, -1, -1}, {-1, -1, 1}, {-1, -1, -1}}, 1);
    }

    public void kombHor1(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, true, "Vinnesta horizontālais kombinācijas tests 1");
    }

    public void kombHor2(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, true, "Vinnesta horizontālais kombinācijas tests 2");
    }

    public void kombHor3(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, false, "Vinnesta horizontālais kombinācijas tests 3");
    }

    public void kombVert1(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, true, "Vinnesta vertikālais kombinācijas tests 1");
    }

    public void kombVert2(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, true, "Vinnesta vertikālais kombinācijas tests 2");
    }

    public void kombVert3(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, false, "Vinnesta vertikālais kombinācijas tests 3");
    }

    public void kombDiag1(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, true, "Vinnesta diagonāles kombinācijas tests 1");
    }

    public void kombDiag2(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, true, "Vinnesta diagonāles kombinācijas tests 2");
    }

    public void kombDiag3(int[][] field, int playerToCheck) {
        TicTacToe25 testi = new TicTacToe25();
        boolean realResult = testi.isWinPosition(field, playerToCheck);
        check(realResult, false, "Vinnesta diagonāles kombinācijas tests 3");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = ir precīza");
        } else {
            System.out.println(testName + " = nav precīza");
        }
    }
}

