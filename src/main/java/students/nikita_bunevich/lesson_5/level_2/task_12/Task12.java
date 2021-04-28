package students.nikita_bunevich.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        for(int i=0; i < 3; i++) {
            number[i]=random.nextInt();
            System.out.println(Arrays.toString(number));
        }
    }
}
