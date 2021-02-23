package students.arkadij.lesson_5.task_13;

import java.util.Arrays;
import java.util.Random;

class RandomSumNumbers {

    public static void main(String[] args) {
        Random randomNum = new Random();
        int[] anyNumbers = new int[3];
        int sum = 0;
        for (int i = 0; i < anyNumbers.length; i++){
            anyNumbers [i] = randomNum.nextInt(50);
            sum += anyNumbers[i];
        }
        System.out.println(Arrays.toString(anyNumbers) + " = " + sum);
    }


}
