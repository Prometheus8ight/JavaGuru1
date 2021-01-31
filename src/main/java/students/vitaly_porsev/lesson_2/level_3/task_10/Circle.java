package students.vitaly_porsev.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.println("Периметр круга: " + perimeter);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга: " + area);

        scanner.close();
    }
}
