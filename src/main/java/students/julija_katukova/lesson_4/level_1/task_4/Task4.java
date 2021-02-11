package students.julija_katukova.lesson_4.level_1.task_4;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if ((num % 2) == 0) {
            System.out.println("You entered even number.");
        }
        else {
            System.out.println("You entered odd number.");
        }

    }

}
