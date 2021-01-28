package students.rodion_afanasjev.lesson_2.level_3.task_10;

class CicrleMeasurements {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Radius: ");

        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
