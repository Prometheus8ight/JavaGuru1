package students.kristine_paskevica.lesson_6.level_5;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.komb1( new int[][]{{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}}, 0);
        test.komb2( new int[][]{{0, -1, 0}, {1, 1, 1}, {-1, -1, -1}}, 1);
        test.komb3( new int[][]{{1, -1, 0}, {1, 1, 1}, {1, -1, -1}}, 1);
        test.komb4( new int[][]{{1, -1, 0}, {1, 1, -1}, {0, 0, 0}}, 0);
        test.komb5( new int[][]{{-1, -1, 0}, {1, 1, -1}, {0, -1, 0}}, 0);

    }

    public void komb1 (int[][] field, int playerToCheck) {
        TicTacToe testi = new TicTacToe();
        boolean realResult = testi.isWinPositionForHorizontals(field, playerToCheck);
        check(realResult, true,"Vinnesta kombinācijas tests 1");
    }

    public void komb2 (int[][] field, int playerToCheck) {
        TicTacToe testi = new TicTacToe();
        boolean realResult = testi.isWinPositionForHorizontals(field, playerToCheck);
        check(realResult, true,"Vinnesta kombinācijas tests 2");
    }

    public void komb3 (int[][] field, int playerToCheck) {
        TicTacToe testi = new TicTacToe();
        boolean realResult = testi.isWinPositionForHorizontals(field, playerToCheck);
        check(realResult, true,"Vinnesta kombinācijas tests 3");
    }

    public void komb4 (int[][] field, int playerToCheck) {
        TicTacToe testi = new TicTacToe();
        boolean realResult = testi.isWinPositionForHorizontals(field, playerToCheck);
        check(realResult, true,"Vinnesta kombinācijas tests 4");
    }

    public void komb5 (int[][] field, int playerToCheck) {
        TicTacToe testi = new TicTacToe();
        boolean realResult = testi.isWinPositionForHorizontals(field, playerToCheck);
        check(realResult, false,"Vinnesta kombinācijas tests 5");
    }

    public void check (boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " ir precīza");
        }
        else {
            System.out.println(testName + " nav precīza");
        }
    }
}
