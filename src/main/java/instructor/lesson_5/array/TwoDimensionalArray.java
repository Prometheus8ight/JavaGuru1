package instructor.lesson_5.array;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        char[][] board = new char[6][3];

        board[0][0] = '.';
        board[0][1] = '.';
        board[0][2] = 'X';

        board[1][0] = '.';
        board[1][1] = '.';
        board[1][2] = 'O';

        board[2][0] = '.';
        board[2][1] = '.';
        board[2][2] = '.';

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));

        System.out.println("board[0][2] = " + board[0][2]);

        System.out.println("board.length = " + board[0].length);

//        System.out.println(Arrays.deepToString(board));

        /*

             0  1  2
           0 .  .  .
           1 .  .  .
           2 .  .  .

         */


    }
}
