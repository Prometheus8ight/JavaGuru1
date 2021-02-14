package students.pavels_steinbors.lesson_4_level_1_task_2;

import java.util.Scanner;

class CompareNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = input.nextInt();

        if (number < 0)
            System.out.println("Number is negative");

        else if (number > 0)
            System.out.println("Number is negative");

        else
            System.out.println("Number is equal to zero");



    }
}
