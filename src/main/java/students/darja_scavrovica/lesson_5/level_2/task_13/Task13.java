package students.darja_scavrovica.lesson_5.level_2.task_13;

import java.util.Arrays;
import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[3];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);



    }

}
