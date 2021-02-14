package students.bogdans_pavlovs.lesson_4.level_3.task_9;

import java.util.Scanner;

class WhichOrder {

    public static void main(String[] args) {

        Scanner enterNumber = new Scanner(System.in);

        System.out.print("Pick the first integer: ");
        int firstNumber = enterNumber.nextInt();

        System.out.print("Pick the second integer: ");
        int secondNumber = enterNumber.nextInt();

        System.out.print("Pick the third integer: ");
        int thirdNumber = enterNumber.nextInt();

        if (firstNumber > secondNumber && secondNumber > thirdNumber){

            System.out.println("Numbers were entered in descending order");

        } else if (firstNumber < secondNumber && secondNumber < thirdNumber){

            System.out.println("Numbers were entered in ascending order");
        } else {

            System.out.println("The order of numbers is neither ascending, nor descending");
        }

    }
}
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */