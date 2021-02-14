package students.arkadij.lesson_4.task_10;
import java.util.Scanner;

class HighestNumber {

    public static void main(String[] args) {
        System.out.println("|| HIGHEST NUMBER ||");

        Scanner scanned = new Scanner(System.in);
        System.out.println("1st number: ");
        int num1 = scanned.nextInt();
        System.out.println("2nd number: ");
        int num2 = scanned.nextInt();
        System.out.println("3rd number: ");
        int num3 = scanned.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Highest number: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("Highest number: " + num2);
        } else if (num3 > num2 && num3 > num1){
            System.out.println("Highest number: " + num3);
        } else {
            System.out.println("Some numbers are equal!");
        }
    }

}
