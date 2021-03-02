package students.arkadij.lesson_5.task_25;

import java.util.Arrays;
import java.util.Scanner;

class LengthOfArray {

    public static void main(String[] args) {
        System.out.println("Please write down the length of array:");
        Scanner scanLength = new Scanner(System.in);
        int typedLength = scanLength.nextInt();
        int [] value = new int[typedLength];
        for (int i = 0; i < value.length; i++){
            value[i] = typedLength;
        }

        System.out.println("Your array length is: " + Arrays.toString(value));
    }

}
