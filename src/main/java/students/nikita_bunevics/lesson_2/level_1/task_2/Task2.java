package students.nikita_bunevics.lesson_2.level_1.task_2;

class Task2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите первое дробное число:");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Введите второе дробное число:");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Сложение:" + (firstDoubleNumber + secondDoubleNumber));
        System.out.println("Вычитание:" +(firstDoubleNumber - secondDoubleNumber));
        System.out.println("Умножение:" +(firstDoubleNumber * secondDoubleNumber));
        System.out.println("Деление:" +(firstDoubleNumber / secondDoubleNumber));

    }
}
