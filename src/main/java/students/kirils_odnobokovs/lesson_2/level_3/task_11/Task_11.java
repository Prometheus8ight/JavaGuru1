package students.kirils_odnobokovs.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Please, Enter the A value");
        double a = scanner.nextInt();
        System.out.println("Please, Enter the B value");
        double b = scanner.nextInt();
        System.out.println("Please, Enter the C value");
        double c = scanner.nextInt();

        double d = (a + b + c) / 3;

        System.out.println("Average from A,B,C = " + d);
    }
}
