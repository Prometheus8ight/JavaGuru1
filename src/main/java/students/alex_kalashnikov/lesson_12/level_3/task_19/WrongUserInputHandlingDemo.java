package students.alex_kalashnikov.lesson_12.level_3.task_19;

import java.util.InputMismatchException;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        while (true) {
            try {
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.print("Enter Integer: ");
                int a = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong data! Enter again!");
            }
        }
    }

}