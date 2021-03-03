package students.deniss_jankovskis.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_30 {

    public static void main(String[] args) {
        int[] foo = new int[12];
        Random random = new Random();
        int[] randomNumbers = new int[12];
        for (int i = 0; i < 12; i++) {
            foo[i] = random.nextInt(50);
        }
        System.out.println("Random numbers: " + Arrays.toString(foo));

        for (int i = 0; i < 12; i++) {
            if (foo[i] % 2 != 0) {

                System.out.println("Odd number: " + foo[i]);


            }
        }
    }
}
