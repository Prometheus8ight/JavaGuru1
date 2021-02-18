package students.rodion_afanasjev.lesson_5.level_2.task_11;
import java.util.Scanner;

class ArrayNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = scan.nextInt();

        System.out.println("Input second number: ");
        int num2 = scan.nextInt();

        System.out.println("Input third number: ");
        int num3 = scan.nextInt();

        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }

}
