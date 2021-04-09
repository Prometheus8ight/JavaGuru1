package students.vitaly_porsev.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while (true) {
            try {
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println(x);
                break;
            } catch (NumberFormatException n) {
                System.out.println("You have entered a string, please enter an integer:");
            }
        }
    }
}
