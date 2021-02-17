package instructor.lesson_5.password;

import java.util.Scanner;

class Prompter {

    int promptPasswordLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter password's length: ");
        return scanner.nextInt();
    }
}
