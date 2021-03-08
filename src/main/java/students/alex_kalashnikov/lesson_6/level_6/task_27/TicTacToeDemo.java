package students.alex_kalashnikov.lesson_6.level_6.task_27;

import java.util.Arrays;

class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe newGame = new TicTacToe();
        System.out.println(Arrays.deepToString(newGame.createField()));

    }

}
