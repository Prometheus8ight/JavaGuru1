package students.julija_katukova.lesson_9.level_7.task_34;

import java.util.Scanner;

class GetNextMove {

    Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter row (from 0 to 5) for your next move: ");//// запросите у пользователя с консоли две координаты
        int row = scanner.nextInt();
        System.out.println("Please enter column (from 0 to 6) for your next move: ");
        int column = scanner.nextInt();
        return new Move(row, column);
    }

}
