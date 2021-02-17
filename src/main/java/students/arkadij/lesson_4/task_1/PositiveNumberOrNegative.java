package students.arkadij.lesson_4.task_1;
import java.util.Scanner;

class PositiveNumberOrNegative {

    public static void main(String[] args) {

        int ourNumber = 7;

        Scanner enterNumber = new Scanner(System.in);
        System.out.println("POSITIVE OR NEGATIVE GAME\n");
        System.out.println("Please enter your number below: ");
        int number = enterNumber.nextInt();

        if (number > ourNumber){
            System.out.println("Your number is positive: " + number);
            System.out.println("Ours number is: " + ourNumber);
        } else if (number < ourNumber){
            System.out.println("Your number is negative: " + number);
            System.out.println("Ours number is:" + ourNumber);
        } else {
            System.out.println("Your number is identical to ours: " + number);
            System.out.println("Ours number is: " + ourNumber);
        }
    }

}
