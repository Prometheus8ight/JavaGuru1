package students.andrew_galashin.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_15 {
    public static void main(String[] args) {
        Random random = new Random();


        int[] randomize = new int[3];
        for (int i = 0; i < randomize.length; i++ ) {
            randomize[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(randomize));
        int upper = 2;
        for (int i = 0; i <randomize.length; i++){
            randomize[i] += upper;
        }
            System.out.println(Arrays.toString(randomize));
    }
}
