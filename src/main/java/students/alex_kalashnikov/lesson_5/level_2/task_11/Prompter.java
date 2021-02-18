package students.alex_kalashnikov.lesson_5.level_2.task_11;

import java.util.Scanner;

class Prompter {

    int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter index value: ");
        return scanner.nextInt();
    }
}