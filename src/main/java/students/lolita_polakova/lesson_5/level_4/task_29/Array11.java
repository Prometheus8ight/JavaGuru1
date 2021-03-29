package students.lolita_polakova.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class Array11 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));

        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println("Even: " + number);
            }
        }
    }
}