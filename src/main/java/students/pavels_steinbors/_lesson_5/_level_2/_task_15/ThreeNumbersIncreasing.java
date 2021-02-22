package students.pavels_steinbors._lesson_5._level_2._task_15;

import java.util.Random;
import java.util.Arrays;

class ThreeNumbersIncreasing {

    public static void main(String[] args) {

        int[] number = new int[3];
        Random random = new Random();

        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(50);
        }
        System.out.println("Numbers before increasing: " + Arrays.toString(number));


        for (int i = 0; i < number.length; i++){
           number[i] += 2;
        }

        System.out.println("Numbers after increasing: " + Arrays.toString(number));


    }

}
