package students.andrew_galashin.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_27 {
    public static void main(String[] args) {
        int[] x = new int[3];
        int max = x[0];
        System.out.println("Длина массива = " + 3);

            Random random = new Random();
            int randomize = 0;
            for (int i = 0; i < x.length; i++) {
                x[i] = random.nextInt();
        }
            System.out.println(Arrays.toString(x));

                for (int i = 0; i < x.length; i++){
                    System.out.println(x[i] +"; ");
                    if (x[i] > max){
                        max = x[i];
                    }
                }
                    System.out.println("Hаибольшее число в массиве: " + max);
    }
}
//Не могу понять как решить проблему, если все 3 числа отрицательные.