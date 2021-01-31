package students.vitaly_porsev.lesson_2.level_2.task_8;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String login = scanner.nextLine();
        scanner.close();
        System.out.println("Hello " + login + "!");
    }
}
