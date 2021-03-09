package students.deniss_jankovskis.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number: ");

        int a = scanner.nextInt();

        System.out.println("Please enter a second number: ");

        int b = scanner.nextInt();

        if (a <= b) {
            System.out.println(a + " is the smallest number");
        }
        else {
            System.out.println(b + " is the smallest number");
        }
    }

}
