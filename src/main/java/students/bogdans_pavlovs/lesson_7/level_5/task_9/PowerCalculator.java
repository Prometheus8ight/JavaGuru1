package students.bogdans_pavlovs.lesson_7.level_5.task_9;

import java.util.Scanner;

class PowerCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        while (number == 0){

            System.out.print("Enter your number: ");
            number = scanner.nextInt();
        }

        System.out.print("Enter your exponent: ");
        int exponent = scanner.nextInt();

        // while (exponent == 0){

           // System.out.print("Enter your exponent: ");
           // exponent = scanner.nextInt();
       // }

        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println("Result = " + powerCalculator.exponentiate(number, exponent));
    }

    public int exponentiate (int number, int exponent){

        int temp = number;

        if (exponent == 0){
            return 1;

        } else {

            for (int i = 1; i < exponent; i++){
                temp *= number;

            }

            return temp;
        }

    }

}
