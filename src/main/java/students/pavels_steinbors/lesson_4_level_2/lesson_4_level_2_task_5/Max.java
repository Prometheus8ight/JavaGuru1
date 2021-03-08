package students.pavels_steinbors.lesson_4_level_2.lesson_4_level_2_task_5;

import java.util.Scanner;

class Max {

    public static void main(String[] args) {

        int a;
        int b;
        int max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        b = scanner.nextInt();

        max = a;
        if (b > a) {
            max = b;
        }

        System.out.println("Наибольшее из двух чисел: " + max);

    }

}
