package students.bogdans_pavlovs.lesson_4.level_2.task_7;

import java.util.Scanner;

class EqualOrNot {

    public static void main(String[] args) {

        Scanner enterNumber = new Scanner(System.in);

        System.out.print("Pick the first integer: ");

        int firstNumber = enterNumber.nextInt();

        System.out.print("Pick the second integer: ");

        int secondNumber = enterNumber.nextInt();

        if (firstNumber == secondNumber){

            System.out.println("The numbers are equal!");

        } else {

            System.out.println("The numbers are different..");

        }





    }


}
