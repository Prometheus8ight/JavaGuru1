package students.alex_kalashnikov.lesson_2.level_1.task_1;

public class task2 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        System.out.println("a + b = " + sum);

        double sub = a - b;
        System.out.println("a - b = " + sub);

        double multi = a * b;
        System.out.println("a * b = " + multi);

        double div = a / b;
        System.out.println("a / b = " + div);

    }
}
