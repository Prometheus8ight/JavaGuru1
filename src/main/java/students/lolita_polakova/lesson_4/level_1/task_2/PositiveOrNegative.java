package students.lolita_polakova.lesson_4.level_1.task_2;

import java.util.Scanner;

class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number = zero");
        }
    }
}