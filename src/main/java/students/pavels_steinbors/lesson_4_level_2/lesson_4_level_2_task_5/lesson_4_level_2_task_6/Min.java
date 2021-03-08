package students.pavels_steinbors.lesson_4_level_2.lesson_4_level_2_task_5.lesson_4_level_2_task_6;

import java.util.Scanner;

class Min {

    public static void main(String[] args) {

        int a;
        int b;
        int min;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        b = scanner.nextInt();

        min = a;
        if (b < a) {
            min = b;
        }

        System.out.println("Наименьшее из двух чисел: " + min);

    }


}

