package students.deniss_jankovskis.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_12 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] foo = new int[3];
        for (int i = 0; i < 3; i++) {
            foo[i] = random.nextInt(10);
            System.out.println(Arrays.toString(foo));

        }

    }

}
