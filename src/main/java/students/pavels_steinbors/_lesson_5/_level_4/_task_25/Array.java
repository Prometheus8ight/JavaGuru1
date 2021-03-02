package students.pavels_steinbors._lesson_5._level_4._task_25;

import java.util.Scanner;

class Array {

    int length () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put array's length: ");
        return scanner.nextInt();
    }

    int value () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put array's value: ");
        return scanner.nextInt();
    }
}
