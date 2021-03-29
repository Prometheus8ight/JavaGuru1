package students.andrew_galashin.lesson_6.level_6.task_33;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in); // запросите у пользователя с консоли две координаты
        System.out.println("Enter first number(0-2): ");
        int x = scanner.nextInt();
        System.out.println("Enter second number(0-2): ");
        int y = scanner.nextInt();
        return new Move(x, y);

    }

    void enemyAI(int[][] field, int player) {
        Random randomize = new Random();
        boolean isTrue = false;
        do {
            int x = randomize.nextInt(3);
            int y = randomize.nextInt(3);
            if (field[x][y] == -1) {
                field[x][y] = player;
                isTrue = true;
            }
        } while (!isTrue);
    }

    public void printFieldToConsole(int[][] field) {
        for (int[] x : field) {
            System.out.println(Arrays.toString(x));
        }
    }

    public int[][] createField() {
        int field[][] = new int[3][3];
        fill(field);
        return field;
    }

    void fill(int[][] field) {
        for (int[] arr : field) {
            Arrays.fill(arr, -1);
        }
    }

    public boolean field(int[][] field) {
        for (int[] arr : field) {
            for (int i : arr) {
                if (i != -1) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean horizontal(int[][] x, int check) {
        for (int i = 0; i < x.length; i++) {
            int j = 0;
            for (int a = 0; a < x[i].length; a++) {
                if (x[i][a] == check) {
                    j++;
                    if (j == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean full(int[][] field) {
        boolean x = true;
        for (int[] arr : field) {
            for (int arr1 : arr) {
                if (arr1 == -1) {
                    x = false;
                    break;
                }
            }
        }
        return x;
    }


    public boolean isWin(int[][] field, int playerToCheck) {
        return horizontalWin(field, playerToCheck) || verticalWin(field, playerToCheck) || diagonalWin(field, playerToCheck);
    }


    public boolean horizontalWin(int[][] field, int playerToCheck) {
        return horizontal(field, playerToCheck);
    }

    public boolean verticalWin(int[][] field, int playerToCheck) {
        return isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean diagonalWin(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else {
            return field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck;
        }
    }


    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWin(field, 0)) {
                System.out.println("Player WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
            enemyAI(field, 1);
            if (isWin(field, 1)) {
                System.out.println("AI win");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
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

    boolean isDraw(int[][] field) {
        if (!isWin(field, 0) && !isWin(field, 1)) {
            return full(field);
        }
        return false;
    }
}

