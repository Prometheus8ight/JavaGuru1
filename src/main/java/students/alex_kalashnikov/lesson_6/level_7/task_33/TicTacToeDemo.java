package students.alex_kalashnikov.lesson_6.level_7.task_33;

import java.util.Arrays;

class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe newGame = new TicTacToe();
    //    String[][] arrayHorizontal = new String[][]{{".", "X", "."}, {"X", "0", "X"}, {"X", ".", "X"}};
    //    Move row = newGame.computer(arrayHorizontal);
    //    String[][] arrayVertical = new String[][] {{"0", "0", "X"}, {"X", "0", "."}, {".", "0", "X"}};
    //    Move column = newGame.computer(arrayVertical);
    //    String[][] arrayDiagonalTwo = new String[][] {{".", "0", "X"}, {"0", ".", "."}, {"X", "0", "0"}};
    //    Move row = newGame.computer(arrayDiagonalTwo);


    //    System.out.println(row.getX() + "  " + row.getY());

        newGame.play();

    }

}