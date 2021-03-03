package students.vitaly_porsev.lesson_6.level_6.task_28;

import java.util.Scanner;

class TicTacToe {

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа координат: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Move(x, y);
    }
}
