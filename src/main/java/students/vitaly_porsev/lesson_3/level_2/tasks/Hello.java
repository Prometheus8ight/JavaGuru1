package students.vitaly_porsev.lesson_3.level_2.tasks;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя пользователя: ");
        String name = scanner.nextLine();
        String hello = "Hello " + name + "!";
        System.out.println(hello);
    }
}
