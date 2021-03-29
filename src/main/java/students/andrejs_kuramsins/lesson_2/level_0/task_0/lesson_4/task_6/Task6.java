package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_6;
import java.util.Scanner;
public class Task6 {

    public static void main(String[] args) {

        System.out.println("Please enter your first number : ");
        Scanner num1 = new Scanner(System.in);
        int first = num1.nextInt();
        System.out.println("Please enter your second number :");
        Scanner num2 = new Scanner(System.in);
        int second = num2.nextInt();

        if (first < second )
            System.out.println(first);
        else
            System.out.println(second);

    }
}
