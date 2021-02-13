package students.nikita_bunevich.lesson_2.level_3.task_10;

class Task10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();
        double pi = Math.PI;

        System.out.println("Perimeter is =" + 2.0 * pi * radius);
        System.out.println("Area is =" + pi * (radius * radius));

    }
}
