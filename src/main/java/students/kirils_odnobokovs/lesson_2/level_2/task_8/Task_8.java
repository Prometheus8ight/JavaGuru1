package students.kirils_odnobokovs.lesson_2.level_2.task_8;

public class Task_8 {

    public static void main(String[] args) {
        System.out.println("What's your name?");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello, " + s + "!");
    }
}
