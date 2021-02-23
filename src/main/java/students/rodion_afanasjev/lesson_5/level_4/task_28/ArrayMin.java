package students.rodion_afanasjev.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class ArrayMin {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(min);


    }

}
