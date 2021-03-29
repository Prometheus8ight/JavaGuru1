package students.lolita_polakova.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class Array8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please enter array's length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}