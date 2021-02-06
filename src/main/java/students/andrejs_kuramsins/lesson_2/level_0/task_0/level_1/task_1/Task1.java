package students.andrejs_kuramsins.lesson_2.level_0.task_0.level_1.task_1;

class Task1 {
    public static void main(String[] args) {


        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(" Enter please your first number : ");
        int first = scanner.nextInt();

        System.out.print(" Enter please your second number : ");
        int second = scanner.nextInt();

        int sum = first + second;
        System.out.println(" first + second = " + sum);

        int sub = first - second;
        System.out.println(" first - second = " + sub);

        int multi = first * second;
        System.out.println(" first * second = " + multi);

        int div = first / second;
        System.out.println(" first / second = " + div);

    }


}
