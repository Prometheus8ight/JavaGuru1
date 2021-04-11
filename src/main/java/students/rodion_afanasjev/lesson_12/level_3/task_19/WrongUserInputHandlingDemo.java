package students.rodion_afanasjev.lesson_12.level_3.task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // сканнер
        System.out.println("Input integer number: ");
        String line = scan.nextLine(); // считать строку с консоли
        while (true) { // пока условие истинно
            try {
                int digit = Integer.parseInt(line);
                System.out.println("Your number is: " + digit);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error!");
            }
            line = scan.nextLine();
        }
    }
}
