package students.rodion_afanasjev.lesson_2.level_5.task_15;

class Print {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = scanner.next();

        System.out.print("Welcome back " + name + "!");

    }
}
