package students.lolita_polakova.lesson_4.level_3.task_9;

import java.util.Scanner;

class NumericalOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter second integer number: ");
        int b = scanner.nextInt();
        System.out.print("Please enter third integer number: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Increasing order");
        } else if (a > b && b > c) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
