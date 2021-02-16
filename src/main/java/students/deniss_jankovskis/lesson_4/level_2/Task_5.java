package students.deniss_jankovskis.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {

    //Нельзя пользоваться классом Math, можно использовать только if else.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");

        int firstNumber = scanner.nextInt();

        System.out.println("Please enter second number: ");

        int secondNumber = scanner.nextInt();

        if (firstNumber >= secondNumber) {
            System.out.println(firstNumber + " is the largest number");
        }
        else {
            System.out.println(secondNumber + " is the largest number");
        }




    }

}



