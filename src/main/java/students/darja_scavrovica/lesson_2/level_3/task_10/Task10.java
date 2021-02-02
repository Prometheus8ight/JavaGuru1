package students.darja_scavrovica.lesson_2.level_3.task_10;

class Task10 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter radius of the circle");
        double a = scanner.nextDouble();

        System.out.println ("Perimeter is = "+a*Math.PI *2);
        System.out.println ("Area is  = "+a*a*Math.PI);




    }
}
