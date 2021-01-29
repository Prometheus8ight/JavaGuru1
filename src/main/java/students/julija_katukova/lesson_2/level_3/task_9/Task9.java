package students.julija_katukova.lesson_2.level_3.task_9;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число:");
        System.out.println("Введите второе целое число:");
        System.out.println("Введите третье целое число: ");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        double average = ((double)firstNumber+secondNumber+thirdNumber) / 3;

        System.out.println("Cреднее арифметическое = " + average);

        scanner.close();


    }


}
