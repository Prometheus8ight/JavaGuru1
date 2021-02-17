package students.arkadij.lesson_4.task_11;
import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        System.out.println("|| ADDITION, SUBTRACTION, DIVISION, MULTIPLICATION ||");

        Scanner scanned = new Scanner(System.in);
        System.out.println("1st number: ");
        int num1 = scanned.nextInt();
        System.out.println("2nd number: ");
        int num2 = scanned.nextInt();

        int additional = additional(num1,num2);
        System.out.println(num1+"+"+num2+"="+additional);
        int subtraction = subtraction(num1,num2);
        System.out.println(num1+"-"+num2+"="+subtraction);
        int division = division(num1,num2);
        System.out.println(num1+"/"+num2+"="+division);
        int multiplication = multiplication(num1,num2);
        System.out.println(num1+"*"+num2+"="+multiplication);
    }

    private static int additional(int num1, int num2){
        return num1 + num2;
    }
    private static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    private static int division(int num1, int num2){
        return num1 / num2;
    }
    private static int multiplication(int num1, int num2){
        return num1 * num2;
    }

}
