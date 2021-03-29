package students.andrew_galashin.lesson_9.level_1.task_5;

import java.util.Scanner;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:      (password = 1234)");
        safe.password = scanner.nextInt();
        safe.check(safe.password, 1234);
        safe.putOrGet();
    }





}
