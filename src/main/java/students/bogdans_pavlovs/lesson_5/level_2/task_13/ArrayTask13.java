package students.bogdans_pavlovs.lesson_5.level_2.task_13;

import java.util.Random;

class ArrayTask13 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random generator = new Random();

        numbers[0] = generator.nextInt(99);
        numbers[1] = generator.nextInt(99);
        numbers[2] = generator.nextInt(99);

        int arraySum = numbers[0] + numbers[1] + numbers[2];

        System.out.println("Generator chose: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);
        System.out.println("Array sum is: " + arraySum);


    }
}
