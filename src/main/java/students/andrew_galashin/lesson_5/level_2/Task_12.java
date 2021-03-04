package students.andrew_galashin.lesson_5.level_2;

import java.util.Random;
import java.util.Arrays;
class Task_12 {
    public static void main(String[] args) {
        Random random = new Random();


            int[] randomize = new int[3];
        for (int i = 0; i < randomize.length; i++ ) {
            randomize[i] = random.nextInt();
        }
            System.out.println(Arrays.toString(randomize));
    }
}
