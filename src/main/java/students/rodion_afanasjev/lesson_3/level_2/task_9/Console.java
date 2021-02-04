package students.rodion_afanasjev.lesson_3.level_2.task_9;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your name, stranger?");
        String userName = input.nextLine();

        System.out.println("Hello " + userName + "!");

    }

}
