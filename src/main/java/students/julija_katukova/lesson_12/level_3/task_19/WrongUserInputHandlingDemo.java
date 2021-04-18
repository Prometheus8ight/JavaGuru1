package students.julija_katukova.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer number: ");
        while (true) {
            try {
                int input = Integer.parseInt(scanner.next());
                    System.out.println("OK");
                    break;
            } catch (NumberFormatException e) {
                System.out.println("ERROR");

            }
        }
    }
}
