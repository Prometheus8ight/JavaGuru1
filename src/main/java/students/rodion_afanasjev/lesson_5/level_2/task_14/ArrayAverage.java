package students.rodion_afanasjev.lesson_5.level_2.task_14;

import java.util.Arrays;
import java.util.Random;

class ArrayAverage {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        for ( int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(15);
        }

        int sum = 0;
        for ( int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        int average = sum / numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println(average);

    }

}
