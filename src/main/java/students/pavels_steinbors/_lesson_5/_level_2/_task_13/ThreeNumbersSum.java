package students.pavels_steinbors._lesson_5._level_2._task_13;

import java.util.Arrays;
import java.util.Random;

class ThreeNumbersSum {

    public static void main(String[] args) {

        int[] number = new int[3];
        Random random = new Random();

        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(50);
        }
        int sum = 0;
        for (int i = 0; i < number.length; i++){
            sum += number[i];
        }

        System.out.println(Arrays.toString(number));
        System.out.println("Sum of three numbers is: " + sum);


    }
}
