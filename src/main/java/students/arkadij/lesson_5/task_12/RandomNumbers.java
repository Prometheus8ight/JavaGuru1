package students.arkadij.lesson_5.task_12;

import java.util.Arrays;
import java.util.Random;

class RandomNumbers {

    public static void main(String[] args) {
        Random someNumbers = new Random();
        int[] anyNumbers = new int[3];
        for (int i = 0; i < anyNumbers.length; i++){
            anyNumbers[i] = someNumbers.nextInt(77);
        }
        System.out.println("Random numbers are: ");
        System.out.println(Arrays.toString(anyNumbers));
    }

}
