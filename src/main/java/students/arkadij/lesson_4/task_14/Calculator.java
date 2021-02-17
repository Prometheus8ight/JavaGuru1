package students.arkadij.lesson_4.task_14;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        System.out.println("|| ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION ||");

        Scanner scanned = new Scanner(System.in);
        System.out.println("1st number: ");
        int num1 = scanned.nextInt();
        System.out.println("2nd number: ");
        int num2 = scanned.nextInt();

        int addition = addition(num1,num2);
        System.out.println(num1+"+"+num2+"="+addition);
        int subtraction = subtraction(num1,num2);
        System.out.println(num1+"-"+num2+"="+subtraction);
        int division = division(num1,num2);
        System.out.println(num1+"/"+num2+"="+division);
        int multiplication = multiplication(num1,num2);
        System.out.println(num1+"*"+num2+"="+multiplication);

        boolean even = isEven(multiplication);
        System.out.println("Multiplication is even = "+even);
        boolean even2 = isEven(division);
        System.out.println("Division is even = " + even2);
        boolean even3 = isEven(subtraction);
        System.out.println("Subtraction is even = " + even3);
        boolean even4 = isEven(addition);
        System.out.println("Addition is even = " + even4);

        int maxNumberOne = maxOfTwoNumbers(multiplication,division);
        System.out.println("Highest from multiplication and division is: "+ maxNumberOne);
        int maxNumberTwo = maxOfTwoNumbers(addition,subtraction);
        System.out.println("Highest from addition and subtraction is: "+ maxNumberTwo);
    }

    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static int maxOfTwoNumbers(int numberOne, int numberTwo){
        if (numberOne > numberTwo){
            return numberOne;
        } else {
            return numberTwo;
        }
    }
}
