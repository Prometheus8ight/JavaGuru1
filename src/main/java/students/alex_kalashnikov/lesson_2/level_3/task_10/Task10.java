package students.alex_kalashnikov.lesson_2.level_3.task_10;

class Task10 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble(); // r - radius

        double perimeter = 2 * Math.PI * r;
        System.out.println("perimeter = " + perimeter);

        double area = Math.PI * r * r;
        System.out.println("area = " + area);

    }

}