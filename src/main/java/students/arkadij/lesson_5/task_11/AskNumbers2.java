package students.arkadij.lesson_5.task_11;

import java.util.Scanner;
import java.util.Arrays;

class AskNumbers2 {

    public static void main(String[] args) {
        Scanner hisNumbers = new Scanner(System.in);
        int[] values = new int[3];
        System.out.println("Please type down your three numbers:");

        for (int i = 0; i < values.length; i++){
            values[i] = hisNumbers.nextInt();
        }
        System.out.println("Your numbers are:");
        System.out.println(Arrays.toString(values));
    }

}
