package students.arkadij.lesson_4.task_5;
import java.util.Scanner;

class MoreLess {

    public static void main(String[] args) {

        System.out.println("||| MORE OR LESS |||");

        Scanner entNumberOne = new Scanner(System.in);
        System.out.println("Please enter your 1st number: ");
        int num1 = entNumberOne.nextInt();

        Scanner entNumberTwo = new Scanner(System.in);
        System.out.println("Please enter your 2nd number: ");
        int num2 = entNumberTwo.nextInt();

        if (num1 > num2){
            System.out.println("["+num1+"]"+" is more than "+"["+num2+"]");
        } else if (num1 < num2){
            System.out.println("["+num1+"]"+" is less than "+"["+num2+"]");
        } else {
            System.out.println("["+num1+"]"+" is the same as "+"["+num2+"]");
        }

    }

}
