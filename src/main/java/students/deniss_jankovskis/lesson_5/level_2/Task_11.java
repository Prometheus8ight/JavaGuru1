package students.deniss_jankovskis.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter a number: ");
        int num3 = input.nextInt();

        int[] numbers = new int[3];
        numbers[0] = 45;
        numbers[1] = 79;
        numbers[2] = 83;

        System.out.println(Arrays.toString(numbers));



    }
}
