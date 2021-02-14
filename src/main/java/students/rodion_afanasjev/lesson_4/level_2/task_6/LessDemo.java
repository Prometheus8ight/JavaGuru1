package students.rodion_afanasjev.lesson_4.level_2.task_6;
import java.util.Scanner;

public class LessDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scan.nextInt();
        System.out.println("Input second number: ");
        int num2 = scan.nextInt();
        System.out.println(Math.min(num1,num2));
    }

}
