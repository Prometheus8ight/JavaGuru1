package students.andrew_galashin.lesson_5.level_4;

import java.util.Random;
import java.util.Arrays;

class Task_28 {
    public static void main(String[] args) {
        int[] x = new int[3];
        int min = x[0];
        System.out.println("Длина массива = " + 3);

        Random random = new Random();
        int randomize = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(x));

            for (int i = 0; i < x.length; i++){
                System.out.println(x[i] +"; ");
                if (x[i] < min){
                    min = x[i];
                }
            }
            System.out.println("Hаименьшее число в массиве: " + min);
    }
}