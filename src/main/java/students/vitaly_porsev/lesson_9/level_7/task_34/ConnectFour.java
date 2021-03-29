package students.vitaly_porsev.lesson_9.level_7.task_34;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ConnectFour {

    void gamePlay() {
        ConnectFour connectFour = new ConnectFour();
        int[][] gameField = connectFour.createField();
        int player1 = 8;
        int player2 = 5;

        while (true) {
            connectFour.printFieldToConsole(gameField);
            connectFour.makeMove(gameField, connectFour.getNextMove(), player1);
            if (isWinner(player1, gameField)) {
                System.out.println("Игрок под номером " + player1 + " выйграл!");
                connectFour.printFieldToConsole(gameField);
                break;
            } else if ((connectFour.draw(gameField))) {
                System.out.println("Ничья!");
                break;
            }

            // connectFour.printFieldToConsole(gameField);
            connectFour.randomAIMove(gameField, player2);
            if (isWinner(player2, gameField)) {
                System.out.println("Игрок под номером " + player2 + " выйграл!");
                connectFour.printFieldToConsole(gameField);
                break;
            } else if (connectFour.draw(gameField)) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private void randomAIMove(int[][] field, int player) {
        Random random = new Random();
        boolean trueOrNot = false;
        do {
            int move = random.nextInt(6);
            for (int i = field.length - 1; i >= 0; i--) {
                if (field[i][move] == 0) {
                    field[i][move] = player;
                    trueOrNot = true;
                    break;
                }
            }
        } while (!trueOrNot);
    }

    private void makeMove(int[][] field, Move move, int player) {
        for (int i = field.length - 1; i >= 0; i--) {
            if (field[i][move.getX()] == 0) {
                field[i][move.getX()] = player;
                break;
            }
        }
    }

    private Move getNextMove() {
        boolean isTrue = false;
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Введите цифру от 0 до 6: ");
            x = scanner.nextInt();
            if (x >= 0 && x <= 6) {
                isTrue = true;
            }
        } while (!isTrue);
        return new Move(x);
    }

    private int[][] createField() {
        int[][] field = new int[6][7];
        fillField(field);
        return field;
    }

    private void fillField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }
        }
    }

    private void printFieldToConsole(int[][] field) {
        for (int[] num : field) {
            System.out.println(Arrays.toString(num));
        }
    }

    private boolean draw(int[][] field) {
        for (int[] ints : field) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWinner(int player, int[][] grid) {

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player &&
                        grid[row][col + 1] == player &&
                        grid[row][col + 2] == player &&
                        grid[row][col + 3] == player) {
                    return true;
                }
            }
        }

        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == player &&
                        grid[row + 1][col] == player &&
                        grid[row + 2][col] == player &&
                        grid[row + 3][col] == player) {
                    return true;
                }
            }
        }

        for (int row = 3; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player &&
                        grid[row - 1][col + 1] == player &&
                        grid[row - 2][col + 2] == player &&
                        grid[row - 3][col + 3] == player) {
                    return true;
                }
            }
        }

        for (int row = 0; row < grid.length - 3; row++) {
            for (int col = 0; col < grid[0].length - 3; col++) {
                if (grid[row][col] == player &&
                        grid[row + 1][col + 1] == player &&
                        grid[row + 2][col + 2] == player &&
                        grid[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }
}