package students.arkadij.lesson_5.task_26;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

class RandomLengthOfArray {

    public static void main(String[] args) {
        Random randomedNumbers = new Random();
        System.out.println("Please type down the array length: ");
        Scanner scanType = new Scanner(System.in);
        int typedLength = scanType.nextInt();
        int[] value = new int[typedLength];
        for (int i = 0; i < value.length; i++){
            value[i] = randomedNumbers.nextInt(57);
        }
        System.out.println("Your random array length is: " + Arrays.toString(value));
    }

}
