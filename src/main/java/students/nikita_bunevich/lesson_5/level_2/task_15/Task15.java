package students.nikita_bunevich.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numb = new int[3];
        for (int i = 0; i < numb.length; i++) {
            numb[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numb));

        for (int i = 0; i < numb.length; i++) {
            numb[i] = numb[i] + 2;
        }
        System.out.println(Arrays.toString(numb));
    }
}
