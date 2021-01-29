package students.arkadij.lesson_2.level_3.task_9;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Now we need to know the arithmetic mean, please follow the instructions!\n");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int one = scanner.nextInt();

        System.out.println("Enter 2nd number: ");
        int two = scanner.nextInt();

        System.out.println("Enter 3rd number: ");
        int three = scanner.nextInt();

        double result = (one * two * three) / 3f;

        System.out.println("The arithmetic mean: ");
        System.out.println(result);
    }
}
