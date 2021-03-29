package students.nikita_bunevich.lesson_3.level_2.task_9;

class Task9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Say your name:");

        String userName = scanner.nextLine();
        String greeting = "Hi " + userName + "!";

        System.out.println(greeting);

    }
}
