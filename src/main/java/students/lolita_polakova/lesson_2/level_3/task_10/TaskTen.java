package students.lolita_polakova.lesson_2.level_3.task_10;

class TaskTen {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите радус круга:");
        double r = scanner.nextDouble();
        double pi = 3.14;

        System.out.println("Периметр = " + 2 * pi * r);
        System.out.println("Площадь = " + pi * r * r);

    }
}
