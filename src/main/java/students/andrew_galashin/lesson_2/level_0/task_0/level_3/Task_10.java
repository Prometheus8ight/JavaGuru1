package students.andrew_galashin.lesson_2.level_0.task_0.level_3;

class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double radius = scanner.nextDouble();
        double pi = Math.PI;
                System.out.println("P = " + 2.0 * pi * radius);
        System.out.println("S = " + pi*(radius*radius));
    }
}
