package students.bogdans_pavlovs.level_3.task_10;

class task_10 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double pi = 3.14159265359;

        System.out.print("Enter circle's radius: ");
        double circleRadius = scanner.nextDouble();

        System.out.println("Perimeter = " + pi * 2 * circleRadius);

        System.out.println("Area = " + pi * circleRadius * circleRadius);

    }
}
