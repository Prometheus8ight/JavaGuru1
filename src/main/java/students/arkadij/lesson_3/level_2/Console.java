package students.arkadij.lesson_3.level_2;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("It's very good that you joined us, what's your name?");
        String userName = scanner.nextLine();

        System.out.println("Wow, what a rare name, I'm glad to welcome you " + userName + ".");

    }

}
