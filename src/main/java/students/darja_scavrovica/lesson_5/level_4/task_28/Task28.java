package students.darja_scavrovica.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[4];

        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if(a[i] < min)
                min = a[i];
        }
        System.out.println("Smaller element in array: " + min);

    }
}


