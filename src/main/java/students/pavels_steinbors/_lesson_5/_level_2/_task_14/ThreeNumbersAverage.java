package students.pavels_steinbors._lesson_5._level_2._task_14;

import java.util.Arrays;
import java.util.Random;

public class ThreeNumbersAverage {

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
        int average = sum / number.length;

        System.out.println(Arrays.toString(number));
        System.out.println("Average of three numbers is: " + average);


    }
}
