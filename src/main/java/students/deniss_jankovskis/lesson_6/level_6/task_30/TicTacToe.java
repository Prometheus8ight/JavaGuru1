package students.deniss_jankovskis.lesson_6.level_6.task_30;

import java.util.Scanner;
import java.util.Arrays;


public class TicTacToe {

    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            if (isWin(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            if (isWin(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public int[][] createField() {

        int[][] field = new int[3][3]; //добавил поля
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                field[i][j] = -1;
            }
        }
        return field;

    }

    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter X for your move: ");
        int x = scanner.nextInt();
        System.out.println("Please enter Y for your move: ");
        int y = scanner.nextInt();
        return new Move(x, y);
    }


    public void printFieldToConsole(int[][] field) {

        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }

            System.out.println(Arrays.toString(ints));
        }
    }

    public boolean isDraw(int[][] field) {

        int num = -1;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWin(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }


    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkHorizontalPosition(field, playerToCheck);
    }


    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkVerticalPosition(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkDiagonalPosition(field, playerToCheck);
    }

    public boolean checkHorizontalPosition(int[][] field, int playerToCheck) {
        int count = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    count++;
                }
                if (count == field[i].length) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkVerticalPosition(int[][] field, int playerToCheck) {

        for (int j = 0; j < 3; j++) {
            if (field[0][j] == playerToCheck && field[1][j] == playerToCheck
                    && field[2][j] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalPosition(int[][] field, int playerToCheck) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                    return true;
                } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                    return true;
                }
            }
        }

        return false;
    }

}



