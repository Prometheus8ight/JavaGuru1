package students.darja_scavrovica.lesson_2.level_1.task_2;

class Task2 {
    public static void main(String[] args) {

        System.out.println("Вввести две переменные");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("Сложение");
        double result1 = a + b;
        System.out.println(result1);

        System.out.println("Вычетание");
        double result2 = a - b;
        System.out.println(result2);

        System.out.println("Умножение");
        double result3 = a * b;
        System.out.println(result3);

        System.out.println("Диление");
        double result4 = a / b;
        System.out.println(result4);

    }
}
