package students.julija_katukova.lesson_4.level_1.task_2;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("You entered positive number.");
        }
        else if (num < 0) {
            System.out.println("You entered negative number.");
        }
        else {
            System.out.println("You entered zero.");
        }
    }

}
