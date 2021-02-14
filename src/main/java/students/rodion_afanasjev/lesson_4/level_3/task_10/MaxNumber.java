package students.rodion_afanasjev.lesson_4.level_3.task_10;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scan.nextInt();
        System.out.println("Input second number: ");
        int num2 = scan.nextInt();
        System.out.println("Input third number: ");
        int num3 = scan.nextInt();

        if ( num1 > num2 && num1 > num3){
            System.out.println(num1);
        }
        else if ( num2 > num1 && num2 > num3){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
    }
}
