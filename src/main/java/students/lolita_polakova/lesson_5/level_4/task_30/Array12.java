package students.lolita_polakova.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class Array12 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));

        for (int number : array) {
            if (number % 2 != 0) {
                System.out.println("Odd: " + number);
            }
        }
    }
}