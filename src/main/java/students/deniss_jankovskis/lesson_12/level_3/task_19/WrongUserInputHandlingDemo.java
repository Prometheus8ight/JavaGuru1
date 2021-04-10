package students.deniss_jankovskis.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println(x);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Error! You have entered a string, please enter an integer:");
            }
        }
    }
}
