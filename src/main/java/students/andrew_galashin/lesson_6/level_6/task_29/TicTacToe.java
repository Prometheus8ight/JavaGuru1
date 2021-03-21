package students.andrew_galashin.lesson_6.level_6.task_29;

import java.util.Scanner;
import java.util.Arrays;

class TicTacToe {
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in); // запросите у пользователя с консоли две координаты
        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();
        return new Move(x, y);

    }

    public void printFieldToConsole(int[][] field) {
        for (int[] x : field) {
            System.out.println(Arrays.toString(x));
        }
    }


}

