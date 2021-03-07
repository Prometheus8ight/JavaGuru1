package students.lolita_polakova.lesson_5.level_2.task_11;

import java.util.Scanner;

class Array2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.print("Please enter first integer number: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Please enter second integer number: ");
        numbers[1] = scanner.nextInt();
        System.out.print("Please enter third integer number: ");
        numbers[2] = scanner.nextInt();

        System.out.println("numbers[0]: " + numbers[0]);
        System.out.println("numbers[1]: " + numbers[1]);
        System.out.println("numbers[2]: " + numbers[2]);
    }
}
