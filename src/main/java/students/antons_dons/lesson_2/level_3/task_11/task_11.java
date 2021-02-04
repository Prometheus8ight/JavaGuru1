package students.antons_dons.lesson_2.level_3.task_11;

class task_11 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter first number");
        System.out.println("Enter second number");
        System.out.println("Enter third number");

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        double avarage = (firstNumber + secondNumber + thirdNumber) / 3;

        System.out.println((firstNumber + secondNumber + thirdNumber)/3) ;

        scanner.close();
    }
}
