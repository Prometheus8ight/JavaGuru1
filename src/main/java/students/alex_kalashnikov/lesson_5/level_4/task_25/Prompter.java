package students.alex_kalashnikov.lesson_5.level_4.task_25;

import java.util.Scanner;

class Prompter {

    int promptArrayLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter Array length: ");
        return scanner.nextInt();
    }

    int promptArrayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter Array values: ");
        return scanner.nextInt();
    }

}
