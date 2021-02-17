package students.bogdans_pavlovs.lesson_4.level_3.task_10;

import java.util.Scanner;

class TheHighest {

    public static void main(String[] args) {

        Scanner enterNumber = new Scanner(System.in);

        System.out.print("Pick the first integer: ");
        int firstNumber = enterNumber.nextInt();

        System.out.print("Pick the second integer: ");
        int secondNumber = enterNumber.nextInt();

        System.out.print("Pick the third integer: ");
        int thirdNumber = enterNumber.nextInt();


        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber + " is the highest of the three!");

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber + " is the highest of the three!");

        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println(thirdNumber +" is the highest of the three!");

        } else {
            System.out.println("Looks like all numbers are equal :)");
        }

    }
    
}


/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
Нельзя пользоваться классом Math.
 */