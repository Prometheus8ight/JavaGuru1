package students.darja_scavrovica.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[4];

        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        System.out.println("Largest element in array: " + max);

    }
}

