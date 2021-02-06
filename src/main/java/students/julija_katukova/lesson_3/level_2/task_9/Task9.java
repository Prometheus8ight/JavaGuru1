package students.julija_katukova.lesson_3.level_2.task_9;

public class Task9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your name?");

        String userName = scanner.nextLine();
        String greeting = "Hello " + userName + "!";

        System.out.println(greeting);

        scanner.close();

    }
}
