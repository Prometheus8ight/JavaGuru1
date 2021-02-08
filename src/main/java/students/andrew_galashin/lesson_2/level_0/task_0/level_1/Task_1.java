package students.andrew_galashin.lesson_2.level_0.task_0.level_1;

class Task_1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите первое число:");
        System.out.println("Введите второе число:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Результат сложения" + sum);
        System.out.println("Результат вычитания" + subtraction);
        System.out.println("Результат умножения" + multiplication);
        System.out.println("Резуьтат деления" + division);
        scanner.close();
    }
}
