package students.lolita_polakova.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Array7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array's length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter a number:");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(array));
    }
}