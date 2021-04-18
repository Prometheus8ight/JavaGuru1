package students.andrew_galashin.lesson_12.level_3.task_19;

import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println("Number = " + x);
                break;
            } catch (NumberFormatException a) {
                System.out.println("Error, enter a number: ");
            }
        }

    }
}
