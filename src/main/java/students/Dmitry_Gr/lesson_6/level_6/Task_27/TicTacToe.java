package students.Dmitry_Gr.lesson_6.level_6.Task_27;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    final int SIGN_X = 1;
    final int SIGN_O = 0;
    final int SIGN_EMPTY = -1;
    int[][] field;
    Random random;
    Scanner scanner;


    TicTacToe(int sizeTicTacToe) {
        random = new Random();
        scanner = new Scanner(System.in);
        field = new int[sizeTicTacToe][sizeTicTacToe];
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean rows;
        for (int row = 0; row < field.length; row++) {
            rows = true;
            for (int col = 0; col < field[row].length; col++) {
                rows &= (field[row][col] == playerToCheck);
            }
            if (rows) { return true; }
        }
        return false;
    }

    public boolean isWinPositionForVertical(int[][] field, int playerToCheck) {
        boolean cols;
        for (int row = 0; row < field.length; row++) {
            cols = true;
            for (int col = 0; col < field[row].length; col++) {
                cols &= (field[col][row] == playerToCheck);
            }
            if (cols) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < field.length; i++) {
            toright &= (field[i][i] == playerToCheck);
            toleft &= (field[field.length - i - 1][i] == playerToCheck);
        }
        if (toright || toleft) return true;
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVertical(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == SIGN_EMPTY) return false;
            }
        }
        return true;
    }

    public int[][] createField() {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                field[row][col] = SIGN_EMPTY;
            }
        }
        return field;
    }

    public Move getNextMove() {
        int x, y;
        do {
            System.out.println("Enter X and Y (0..2):");
            x = scanner.nextInt();
            y = scanner.nextInt();
        } while (!isCellValid(x, y));
        Move move = new Move(x, y);
        return move;
    }

    boolean isCellValid(int x, int y) {
        if (x >= 0 && x <=2 && y >= 0 && y <= 2) return true;
        return false;
    }

    public void printFieldToConsole(int[][] field) {
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {
                System.out.print(field[row][col] + " ");
            }
            System.out.println();
        }
    }
    public void play() {
        int[][] field = createField();
        printFieldToConsole(field);
        while(true) {
            System.out.println("Player 0 make move!");
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = SIGN_O;
            printFieldToConsole(field);
            if (isWinPosition(field, SIGN_O)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            System.out.println("Player X make move!");
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = SIGN_X;
            printFieldToConsole(field);
            if (isWinPosition(field, SIGN_X)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}


