package students.julija_katukova.lesson_2.level_2.task_8;

class Task8 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Username:");

        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + ("!"));

        scanner.close();

    }


}
