package students.julija_katukova.lesson_2.level_1.task_2;

class Task2 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите первое вещественное число:");
        System.out.println("Введите второе вещественное число:");

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double subtraction = firstDoubleNumber - secondDoubleNumber;
        double multiplication = firstDoubleNumber * secondDoubleNumber;
        double division = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Результат сложения " + sum);
        System.out.println("Результат вычитания " + subtraction);
        System.out.println("Результат умножения " + multiplication);
        System.out.println("Результат деления " + division);

        scanner.close();


    }


}
