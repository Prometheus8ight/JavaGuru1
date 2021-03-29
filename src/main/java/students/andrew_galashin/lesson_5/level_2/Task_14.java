package students.andrew_galashin.lesson_5.level_2;

import java.util.Random;
import java.util.Arrays;
class Task_14 {
    public static void main(String[] args) {
        Random random = new Random();


        int[] randomize = new int[3];
        int sum = 0;
        for (int i = 0; i < randomize.length; i++ ) {
            randomize[i] = random.nextInt();
            sum = sum + randomize[i];
        }

            int avarage = sum/ randomize.length;
                System.out.println(Arrays.toString(randomize));
                System.out.println("Avarage = " + avarage);
    }
}
