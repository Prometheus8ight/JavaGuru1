package students.andrew_galashin.lesson_5.level_4;

import java.util.Scanner;
import java.util.Arrays;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] x = new int[length];
        for (int i = 0; i < x.length; i++ ) {
            System.out.println("Заполните массив: ");
            x[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(x));
    }
}
