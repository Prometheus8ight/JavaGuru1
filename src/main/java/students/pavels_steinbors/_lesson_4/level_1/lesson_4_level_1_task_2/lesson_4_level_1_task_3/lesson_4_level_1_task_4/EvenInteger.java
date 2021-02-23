package students.pavels_steinbors._lesson_4.level_1.lesson_4_level_1_task_2.lesson_4_level_1_task_3.lesson_4_level_1_task_4;

import java.util.Scanner;

class EvenInteger {

    public static void main(String[] args) {

        int number;

        System.out.println("Введите целое число: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number % 2 == 0 ) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }

    }
}
