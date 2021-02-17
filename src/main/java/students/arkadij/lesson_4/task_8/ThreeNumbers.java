package students.arkadij.lesson_4.task_8;
import java.util.Scanner;

class ThreeNumbers {

    public static void main(String[] args) {

        System.out.println("ALL NUMBERS ARE EQUAL OR DIFFERENT\n");

        Scanner entNumOne = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = entNumOne.nextInt();

        Scanner entNumTwo = new Scanner(System.in);
        System.out.println("Enter 2nd number: ");
        int num2 = entNumTwo.nextInt();

        Scanner entNumThree = new Scanner(System.in);
        System.out.println("Enter 3rd number: ");
        int num3 = entNumThree.nextInt();

        if (num1 == num2 && num2 == num3 && num1 == num3){
            System.out.println("All numbers are equal!");
            System.out.println(num1+" = "+num2+" = "+num3);
        } else if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("All numbers are different!");
            System.out.println(num1+" . "+num2+" . "+num3);
        } else {
            System.out.println("Neither all are equal or different!");
            System.out.println(num1+" . "+num2+" . "+num3);
        }

    }

}
