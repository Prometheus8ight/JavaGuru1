package students.rodion_afanasjev.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

class ArrayRandom {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(12);
        }

        System.out.println(Arrays.toString(numbers));

    }

}
