package students.andrew_galashin.lesson_2.level_0.task_0.level_1;

class Task_2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите первое число");
        System.out.println("Введите второе число");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println("Результат сложения" + sum );
        System.out.println("Результат вычитания" + subtraction);
        System.out.println("Результат умножения" + multiplication);
        System.out.println("Результат деления" + division);
        scanner.close();
    }
}
