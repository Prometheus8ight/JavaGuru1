package instructor.lesson_5.encryption;

import java.util.Scanner;

class Prompter {

    String promptText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your text to encrypt: ");
        return scanner.nextLine();
    }
}
