package instructor.lesson_6.slots;

import java.util.Scanner;

class Prompter {

    String promptNextRound() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("You game!?");
            String input = scanner.nextLine();

            if ("YES".equals(input) || "NO".equals(input)) {
                return input;
            }
        }
    }
}
