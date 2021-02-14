package students.arkadij.lesson_4.task_6;
import java.util.Scanner;

class SmallestNumber {

    public static void main(String[] args) {

        System.out.println("Enter two numbers and we will display only the smallest of them.");

        Scanner entNumOne = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = entNumOne.nextInt();

        Scanner entNumTwo = new Scanner(System.in);
        System.out.println("Enter 2nd number: ");
        int num2 = entNumTwo.nextInt();

        if (num1 > num2){
            System.out.println("["+num2+"]"+" is smallest number!");
        } else if (num1 < num2){
            System.out.println("["+num1+"]"+" is smallest number!");
        } else {
            System.out.println("Need to enter one number higher than other!");
        }

    }

}
