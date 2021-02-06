package students.bogdans_pavlovs.lesson_2.level_1.task_1;

class task_1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int secondNumber = scanner.nextInt();

        // выведите на консоль полученные результаты сложения, вычитания, умножения и деления

        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));

    }
}
