package students.rodion_afanasjev.lesson_4.level_1.task_1;
import java.util.Scanner;

public class IntegerNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input integer number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive number.");
        } else if (number < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("Number is equal to zero.");
        }
    }
}