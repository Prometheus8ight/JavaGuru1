package students.andrew_galashin.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean positive = x >= 0;

        if (positive) {
            System.out.println(x + " это положительное число");

        } else {
            System.out.println(x + " это отрицательное число");
        }

    }
}



