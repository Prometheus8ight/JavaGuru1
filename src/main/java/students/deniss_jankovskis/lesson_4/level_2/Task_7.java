package students.deniss_jankovskis.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first number: ");

        int x = scanner.nextInt();

        System.out.println("Please enter a second number: ");

        int y = scanner.nextInt();

        if (x == y) {
            System.out.println(x + " Numbers are equal");
        } else {
            System.out.println(y + " Numbers are different");
        }
    }
}

