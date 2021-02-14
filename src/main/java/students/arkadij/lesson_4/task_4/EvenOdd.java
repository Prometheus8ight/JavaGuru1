package students.arkadij.lesson_4.task_4;
import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {

        Scanner entNumber = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = entNumber.nextInt();

        if (number % 2 == 0){
            System.out.println("Your number is: " + number);
            System.out.println("Number is even!");
        } else {
            System.out.println("Your number is: " + number);
            System.out.println("Number is odd!");
        }

    }

}
