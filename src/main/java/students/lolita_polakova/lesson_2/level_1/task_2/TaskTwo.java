package students.lolita_polakova.lesson_2.level_1.task_2;

class TaskTwo {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Пожалуйста, введите любое дробное число:");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Пожалуйста, введите другое дробное число:");
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Ну дела, калькулятор и рядом не лежал!");

        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
        System.out.println(secondDoubleNumber - firstDoubleNumber);
        System.out.println(secondDoubleNumber / firstDoubleNumber);

    }
}
