package students.darja_scavrovica.lesson_2.level_1.task_1;

class Task1 {
    public static void main(String[] args) {

        System.out.println("Вввести две переменные");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Сложение");
        int result1 = a + b;
        System.out.println(result1);

        System.out.println("Вычетание");
        int result2 = a - b;
        System.out.println(result2);

        System.out.println("Умножение");
        int result3 = a * b;
        System.out.println(result3);

        System.out.println("Диление");
        int result4 = a / b;
        System.out.println(result4);
    }

}
