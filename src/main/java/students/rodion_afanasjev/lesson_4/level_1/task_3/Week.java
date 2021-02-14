package students.rodion_afanasjev.lesson_4.level_1.task_3;
import java.util.Scanner;

public class Week {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scan.nextInt();

        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Internal error!");
        }

    }
}
