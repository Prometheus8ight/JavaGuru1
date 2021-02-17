package students.bogdans_pavlovs.lesson_4.level_2.task_6;

import java.util.Scanner;

class LowestOfTwo {

    public static void main(String[] args) {

        Scanner enterNumber = new Scanner(System.in);

        System.out.print("Pick the first integer: ");

        int firstNumber = enterNumber.nextInt();

        System.out.print("Pick the second integer: ");

        int secondNumber = enterNumber.nextInt();

        if (firstNumber < secondNumber) {

            System.out.println(firstNumber + " is lower than " + secondNumber);
        } else if (secondNumber < firstNumber) {

            System.out.println(secondNumber + " is lower than " + firstNumber);
        } else {

            System.out.println("The numbers are equal!");

        }

    }

}