package students.lolita_polakova.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Array9 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[13];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Array: " + Arrays.toString(array));

        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max: " + max);

    }  // System.out.println("Max: " + Arrays.stream(array).max().getAsInt()) -> Так же нельзя?..
}