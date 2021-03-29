package students.andrew_galashin.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task_30 {
    public static void main(String[] args) {
        int[] x = new int[3];
        System.out.println("Длина массива = " + 3);

            Random random = new Random();
            int randomize = 0;
            for (int i = 0; i < x.length; i++) {
                x[i] = random.nextInt();
            }
                System.out.println(Arrays.toString(x));

                    for (int i = 0; i < x.length; i++){
                        if (x[i] % 2 != 0){
                        System.out.println("Bсе нечётные числа: " + x[i]);
            }
        }
    }
}
