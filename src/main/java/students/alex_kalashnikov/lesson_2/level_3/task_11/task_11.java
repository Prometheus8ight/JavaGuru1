package students.alex_kalashnikov.lesson_2.level_3.task_11;

public class task_11 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextInt();

        System.out.print("Enter b: ");
        double b = scanner.nextInt();

        System.out.print("Enter c: ");
        double c = scanner.nextInt();

        double average = (a + b + c) / (double) 3;
        System.out.println("average = " + average );

    }

}