package students.vitaly_porsev.lesson_6.level_5.task_25;

public class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest method = new TicTacToeTest();
        method.allTests();

    }

    void allTests() {
        TicTacToeTest method = new TicTacToeTest();
        method.checkHorizontal();
        method.checkVertical();
        method.checkDiagonals();
        method.checkFalse();
    }

    void checkHorizontal() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {0, 0, 0},
                {-1, -1, 1,},
                {-1, 1, 1}};
        checkResult(method.isPlayerWinning(array, 0), "checkHorizontal");
    }

    void checkVertical() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 0, 0},
                {-1, 0, 1,},
                {-1, 0, 1}};
        checkResult(method.isPlayerWinning(array, 0), "checkVertical");
    }

    void checkDiagonals() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 0, 0},
                {-1, 0, 1,},
                {0, -1, 1}};
        checkResult(method.isPlayerWinning(array, 0), "checkDiagonals");
    }

    void checkFalse() {
        TicTacToe method = new TicTacToe();
        int[][] array = {
                {1, 0, 0},
                {-1, -1, 1,},
                {0, -1, 1}};
        checkFalseResult(method.isPlayerWinning(array, 0), "checkFalse");
    }


    void checkResult(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkFalseResult(boolean isTrue, String testName) {
        if (!isTrue) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}