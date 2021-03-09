package students.lolita_polakova.lesson_4.level_3.task_10;

import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int a = scanner.nextInt();
        System.out.print("Please enter second integer number: ");
        int b = scanner.nextInt();
        System.out.print("Please enter third integer number: ");
        int c = scanner.nextInt();

        if (a >= b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
