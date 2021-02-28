package students.vitaly_porsev.lesson_6.level_6.task_30;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            //printFieldToConsole(field);
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
            //printFieldToConsole(field);
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

    public int[][] createField(){
        int[][] field = new int[3][3];
        for (int[] ints : field) {
            Arrays.fill(ints, -1);
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа координат (от 0 до 2): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int[] num : field) {
            System.out.println(Arrays.toString(num));
        }
    }

    public boolean isDraw(int[][] field) {
        if (!isWin(field, 0) && !isWin(field, 1)) {
            return fullField(field);
        }
        return false;
    }

    private boolean fullField(int[][] field) {
        boolean num = true;
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == -1) {
                    num = false;
                    break;
                }
            }
        }
        return num;
    }

    public boolean isWin(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVertical(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return hasSameElementsHorizontal(field, playerToCheck);
    }

    public boolean isWinPositionForVertical(int[][] field, int playerToCheck) {
        return hasSameElementsVerticals(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return hasSameElementsDiagonals(field, playerToCheck);
    }

    private boolean hasSameElementsHorizontal(int[][] field, int playerToCheck) {
        for (int[] ints : field) {
            int counter = 0;
            for (int anInt : ints) {
                if (anInt == playerToCheck) {
                    counter++;
                    if (counter == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasSameElementsVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < 3; j++) {
            if (field[0][j] == playerToCheck && field[1][j] == playerToCheck
                    && field[2][j] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSameElementsDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck
                && field[2][2] == playerToCheck) {
            return true;
        }
        return field[0][2] == playerToCheck && field[1][1] == playerToCheck
                && field[2][0] == playerToCheck;
    }
}