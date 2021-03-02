package students.darja_scavrovica.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;


class Task12 {

        public static void main(String[] args) {
            Random random = new Random();
            int[] arr = new int[4];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt();
            }
            System.out.print(Arrays.toString(arr));

        }
}
