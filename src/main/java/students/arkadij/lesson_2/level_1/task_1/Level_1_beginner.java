package students.arkadij.lesson_2.level_1.task_1;

public class Level_1_beginner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Your 1st number integer: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Your 2nd number integer: ");
        int secondNumber = scanner.nextInt();

        System.out.printf("Addition result: ");
        System.out.println(firstNumber + secondNumber);
        System.out.printf("Subtraction result: ");
        System.out.println(firstNumber - secondNumber);
        System.out.printf("Multiplication result: ");
        System.out.println(firstNumber * secondNumber);
        System.out.printf("Divistion result: ");
        System.out.println(firstNumber / secondNumber);

        System.out.println("\nThank you for a wonderful assignment.");

    }
}
