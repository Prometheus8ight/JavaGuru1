package students.rodion_afanasjev.lesson_4.level_3.task_9;
import java.util.Scanner;

public class Increase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scan.nextInt();
        System.out.println("Input second number: ");
        int num2 = scan.nextInt();
        System.out.println("Input third number: ");
        int num3 = scan.nextInt();

        if ( num1 < num2 && num2 < num3 ){
            System.out.println("Increasing");
        }
        else if ( num1 > num2 && num2 > num3 ){
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
