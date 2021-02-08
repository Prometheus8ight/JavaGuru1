package students.pavels_steinbors.lesson_3.level_2.task_9;

class User {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Write your name: ");

        String userName = scanner.next();
        String hello = "Hello " + userName + "!";

        System.out.print(hello);
    }

}
