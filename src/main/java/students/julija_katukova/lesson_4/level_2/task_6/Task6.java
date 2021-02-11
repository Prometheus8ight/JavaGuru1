package students.julija_katukova.lesson_4.level_2.task_6;

import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second integer number:");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println("The lowest number is " + num1);
        }
        else if (num2 < num1) {
            System.out.println("The lowest number is " + num2);
        }
        else {
            System.out.println("Try again");
        }
    }

}
