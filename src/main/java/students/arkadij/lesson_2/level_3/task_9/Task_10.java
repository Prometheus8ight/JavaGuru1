package students.arkadij.lesson_2.level_3.task_9;

public class Task_10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Write your radius number: ");

            double radius = scanner.nextDouble();
            double perimeter = 2 * Math.PI * radius;
            double area = radius * Math.PI * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
