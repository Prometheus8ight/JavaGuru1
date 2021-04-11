package students.julija_katukova.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter integer number: ");
            if (scanner.hasNextInt()) {
                System.out.println("OK");
                break;
            } else {
                throw new InputException();
            }
        }
    }
}
