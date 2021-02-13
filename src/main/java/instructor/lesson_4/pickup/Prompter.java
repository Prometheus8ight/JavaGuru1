package instructor.lesson_4.pickup;

import java.util.Scanner;

public class Prompter {

    String promptGender() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter partner's gender: ");
        return scanner.nextLine();
    }

    String promptName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter partner's name: ");
        return scanner.nextLine();
    }
}
