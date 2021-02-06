package students.kirils_odnobokovs.lesson_2.level_3.task_10;

public class Task_10 {

    public static void main(String[] args) {
        System.out.println("Enter the Radius!");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double r = scanner.nextDouble();

        double per = Math.PI * (2 * r);
        System.out.println("Circle perimetr = " + per);

        double b = 2;
        double area = Math.PI * Math.pow(r, b);
        System.out.println("Circle area = " + area);



    }
}
