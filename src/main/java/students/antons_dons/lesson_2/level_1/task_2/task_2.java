package students.antons_dons.lesson_2.level_1.task_2;

class task_2 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter a first double number");
        System.out.println("Enter a second double number");

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
    }
}
