package students.antons_dons.lesson_2.level_3.task_10;

class task_10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter radius");

        double radius = 7.5;

        double area = Math.PI * (radius * radius);
        System.out.println("Circle area" + "=" + area);

        double perimeter = 2*Math.PI * (radius);
        System.out.println("Circle perimeter" + "=" + perimeter);

        scanner.close();





    }
}
