package students.andrew_galashin.lesson_5.level_4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] x = new int[length];

        Random random = new Random();
        int randomize = 0;
        for (int i = 0; i < length; i++) {
            x[i] = random.nextInt();
        }
            System.out.println(Arrays.toString(x));
    }
}