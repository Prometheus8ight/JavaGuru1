package students.alex_kalashnikov.lesson_6.level_7.task_33;

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {

        TicTacToe test = new TicTacToe();
        String[][] array = new String[3][3];
        array[0][0] = ".";
        array[0][1] = "X";
        array[0][2] = ".";
        array[1][0] = ".";
        array[1][1] = ".";
        array[1][2] = ".";
        array[2][0] = ".";
        array[2][1] = "X";
        array[2][2] = ".";
        System.out.println(Arrays.deepToString(array));


        int column = -1;
        for (int i = 0; i < array.length; i++) {
            int numberOfMoves = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i].equals("X")) {
                    numberOfMoves++;
                    System.out.println("Vertical " + numberOfMoves);
                }
                if (numberOfMoves == 2) {
                    column = i;
                    break;
                }
            }
        }
        System.out.println(column);
    }

}


