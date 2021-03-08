package students.alex_kalashnikov.lesson_6.level_6.task_29;

import java.util.Arrays;

class TicTacToeDemo {

    public static void main(String[] args) {

        TicTacToe newGame = new TicTacToe();
        newGame.getNextMove();
        newGame.printFieldToConsole(newGame.createField());

    }

}
