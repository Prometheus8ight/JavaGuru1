package students.rodion_afanasjev.lesson_4.level_2;
import java.util.Scanner;

public class Great {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scan.nextInt();
        System.out.println("Input second number: ");
        int num2 = scan.nextInt();

        if ( num1 > num2){
            System.out.println(num1);
        }
        else if ( num1 < num2){
            System.out.println(num2);
        }
        else {
            System.out.println("Internal error!");
        }
    }
}
