package students.rodion_afanasjev.lesson_2.level_1.task_1;

class MathClass {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println ("Enter 2 integers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
}
