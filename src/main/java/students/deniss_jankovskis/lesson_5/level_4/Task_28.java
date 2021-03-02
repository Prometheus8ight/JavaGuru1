package students.deniss_jankovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_28 {

    public static void main(String[] args) {

        int[] foo = new int[20];
        Random random = new Random();
        int[] randomNumbers = new int[20];
        for (int i = 0; i < 20; i++) {
            foo[i] = random.nextInt(200);
        }
        System.out.println("Random numbers: " + Arrays.toString(foo));

        int smallestNumber = foo[0];
        for (int i = 0; i < 20; i++) {
            if(foo[i] < smallestNumber)
                smallestNumber = foo[i];
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }

}
