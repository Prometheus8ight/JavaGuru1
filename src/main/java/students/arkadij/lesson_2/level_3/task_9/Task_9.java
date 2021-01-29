package students.arkadij.lesson_2.level_3.task_9;

public class Task_9 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Please enter integer number for multiplication: ");
            int number = scanner.nextInt();
            int i;
            for (i = 0; i <= 10; i++)

                System.out.println(number + " * " + i + " = " + number * i);

    }
}
