package students.lolita_polakova.lesson_4.level_1.task_4;

import java.util.Scanner;

class OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer number: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
