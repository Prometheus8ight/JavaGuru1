package students.nikita_bunevich.lesson_2.level_2.task_8;

class Task8 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new  java.util.Scanner (System.in);

        System.out.println("Введите ваше имя:");
        String username = scanner.nextLine();

        System.out.println("Hello!" + (username) + ("."));

    }
}
