package students.alex_kalashnikov.lesson_6.level_7.task_33;

import java.util.Arrays;

class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe newGame = new TicTacToe();
    //    String[][] arrayHorizontal = new String[][]{{".", "X", "."}, {"X", "0", "X"}, {"X", ".", "X"}};
    //    Move row = newGame.computer(arrayHorizontal);
    //    String[][] arrayVertical = new String[][] {{"0", "0", "X"}, {"X", "0", "."}, {".", "0", "X"}};
    //    Move column = newGame.computer(arrayVertical);
    //    String[][] array = new String[][] {{"0", ".", "X"}, {".", "X", "."}, {".", "0", "."}};

    /*    int row2 = newGame.computerHorizontal(array,"X");
        System.out.println("computerHorizontal: " + row2);
        int column = newGame.computerVertical(array, "X");
        System.out.println("computerVertical: " + column);
        int rowAndColumn = newGame.computerDiagonalOne(array,"X");
        System.out.println("computerDiagonalOne: " + rowAndColumn);
        int row3 = newGame.computerDiagonalTwo(array, "X");
        System.out.println("computerDiagonalTwo: " + row3);
        int row4 = newGame.computerDefenceHorizontal(array);
        System.out.println("computerDefenceHorizontal: " + row4);
        int row5 = newGame.computerDefenceVertical(array);
        System.out.println("computerDefenceVertical: " + row5);
        int row6 = newGame.computerDefenceDiagonalOne(array);
        System.out.println("computerDefenceDiagonalOne: " + row6);
        int row7 = newGame.computerDefenceDiagonalTwo(array);
        System.out.println("computerDefenceDiagonalTwo: " + row7);




        Move row = newGame.computer(array);
        System.out.println(row.getX() + "  " + row.getY());
*/
        newGame.play();

    }

}