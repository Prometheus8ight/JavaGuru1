package students.bogdans_pavlovs.lesson_4.level_3.task_8;

import java.util.Scanner;

class EqualOrNot {

    public static void main(String[] args) {

        Scanner enterNumber = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumber = enterNumber.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = enterNumber.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = enterNumber.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber){

            System.out.println("All numbers are equal!");

        }else if (firstNumber != secondNumber && firstNumber != thirdNumber){

            System.out.println("None of the numbers match!");

        }else {

            System.out.println("Not all numbers are either different or equal");

        }

    }

}


/*
- "All numbers are equal" if all three numbers are equal,
- "All numbers are different" if all three numbers are different
- "Neither all are equal or different" otherwise.
 */