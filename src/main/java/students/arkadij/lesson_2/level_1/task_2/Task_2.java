package students.arkadij.lesson_2.level_1.task_2;

public class Task_2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Your 1st number double: ");
                double firstDoubleNumber = scanner.nextInt();
            System.out.println("Your 2nd number double: ");
                double secondDoubleNumber = scanner.nextInt();

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);

        System.out.println("\nThank you for a wonderful assignment.");
    }

}
