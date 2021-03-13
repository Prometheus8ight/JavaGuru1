package students.lolita_polakova.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class Array10 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));

        int min = array[0];
        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Min: " + min);


    } //System.out.println("Min: " + Arrays.stream(array).min().getAsInt()) -> :(
}