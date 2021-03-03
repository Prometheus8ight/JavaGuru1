package students.deniss_jankovskis.lesson_6.level_6.task_30;

import students.deniss_jankovskis.lesson_6.level_5.task_26.TicTacToe;

import java.util.Scanner;

class TicTacToeDemo {


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

        int[][] field = new int[3][3];
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

        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {

        for (int[] ints : field) {
            for (int anInt : ints) {
                System.out.println(anInt + " ");
            }

            System.out.println();
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

    public boolean isWinPosition(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        boolean isWinHorizontal = ticTacToe.isWinPositionHorizontals(field, playerToCheck);
        boolean isWinVertical = ticTacToe.isWinPositionVerticals(field, playerToCheck);
        boolean isWinDiagonal = ticTacToe.isWinPositionDiagonals(field, playerToCheck);
        return isWinHorizontal || isWinVertical || isWinDiagonal;

    }

    public boolean isWinPositionHorizontals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkHorizontalPosition(field, playerToCheck);
    }

    public boolean isWinPositionVerticals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkVerticalPosition(field, playerToCheck);
    }

    public boolean isWinPositionDiagonals(int[][] field, int playerToCheck) {

        TicTacToe ticTacToe = new TicTacToe();
        return ticTacToe.checkDiagonalPosition(field, playerToCheck);
    }

}


