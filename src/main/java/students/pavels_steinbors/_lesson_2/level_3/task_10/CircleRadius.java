package students.pavels_steinbors._lesson_2.level_3.task_10;

class CircleRadius {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Test data:");
        System.out.println("Radius =  ");

        double radius = scanner.nextDouble();

        System.out.println("Expected Output");

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);
        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = "+ area);


    }


}



