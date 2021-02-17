package students.arkadij.lesson_4.task_7;
import java.util.Scanner;

class EqualsDifferent {

    public static void main(String[] args) {

        System.out.println("||| EQUALS OR DIFFERENT |||");

        Scanner entNumOne = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = entNumOne.nextInt();

        Scanner entNumTwo = new Scanner(System.in);
        System.out.println("Enter 2nd number: ");
        int num2 = entNumTwo.nextInt();

        if (num1 == num2){
            System.out.println("Numbers are equals!");
            System.out.println("["+num1+"]"+" = "+"["+num2+"]");
        } else {
            System.out.println("Numbers are different!");
            System.out.println("["+num1+"]"+" different "+"["+num2+"]");
        }

    }

}
