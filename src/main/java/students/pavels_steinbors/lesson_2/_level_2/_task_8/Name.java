package students.pavels_steinbors.lesson_2._level_2._task_8;

class Name {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
