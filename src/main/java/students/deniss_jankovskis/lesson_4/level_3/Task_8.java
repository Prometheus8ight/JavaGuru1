package students.deniss_jankovskis.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number: ");

        int a = scanner.nextInt();

        System.out.println("Please enter a second number: ");

        int b = scanner.nextInt();

        System.out.println("Please enter a third number: ");

        int c = scanner.nextInt();



        if (a == b && a == c) {
            System.out.println("All numbers are equal");
        }
        else if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");

        }


    }

}
