package students.bogdans_pavlovs.lesson_2.level_1.task_2;

class Task2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double secondDoubleNumber = scanner.nextDouble();

        //(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.

        System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber));
        System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber));
        System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));

    }
}
