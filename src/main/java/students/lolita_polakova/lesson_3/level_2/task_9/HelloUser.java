package students.lolita_polakova.lesson_3.level_2.task_9;

import java.util.Scanner;

class HelloUser {

    public static void main(String[] args) {

        java.util.Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name:");
        String userName = scanner.next();

        String greeting = ("Hello " + userName + "!");

        System.out.println(greeting);
    }
}
