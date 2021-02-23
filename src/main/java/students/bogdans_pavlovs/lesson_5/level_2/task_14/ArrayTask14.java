package students.bogdans_pavlovs.lesson_5.level_2.task_14;

import java.util.Random;

class ArrayTask14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random generator = new Random();

        for (int i = 0; i < numbers.length; i++){

            numbers[i] = generator.nextInt(999);
        }

        int arraySum = numbers[0] + numbers[1] + numbers[2];
        double arrayAvg = (double) arraySum / numbers.length;


        System.out.println("Generator chose: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);
        System.out.println("Array sum is: " + arraySum);
        System.out.println("Array average is: " + arrayAvg);


    }
}
