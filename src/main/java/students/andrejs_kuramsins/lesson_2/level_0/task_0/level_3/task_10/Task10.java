package students.andrejs_kuramsins.lesson_2.level_0.task_0.level_3.task_10;

public class Task10 {
    public static void main(String[] args) {

        System.out.println("Please enter a random circle radius : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int radius = scanner.nextInt();

        double Pi = 3.14;
        double P = 2 * Pi * radius;
        double S = Pi * (radius * radius);

        System.out.println("P" + "=" + P);
        System.out.println("S" + "=" + S);

    }
}
