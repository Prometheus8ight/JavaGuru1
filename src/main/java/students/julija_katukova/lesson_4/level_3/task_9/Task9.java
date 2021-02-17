package students.julija_katukova.lesson_4.level_3.task_9;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first integer number:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second integer number:");
        int num2 = scanner.nextInt();
        System.out.println("Please enter third integer number:");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        }
        else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
