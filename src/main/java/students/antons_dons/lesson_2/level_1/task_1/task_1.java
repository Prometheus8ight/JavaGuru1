package students.antons_dons.lesson_2.level_1.task_1;

class task_1 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.println("Enter first number");
        System.out.println("Enter second number");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
}
