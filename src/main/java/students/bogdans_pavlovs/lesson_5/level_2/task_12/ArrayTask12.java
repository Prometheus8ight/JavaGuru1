package students.bogdans_pavlovs.lesson_5.level_2.task_12;

import java.util.Random;

class ArrayTask12 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random generator = new Random();

        for(int i = 0; i < numbers.length; i++){

            numbers[i] = generator.nextInt(99);

        }

        System.out.print("Generator chose: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);


    }
}