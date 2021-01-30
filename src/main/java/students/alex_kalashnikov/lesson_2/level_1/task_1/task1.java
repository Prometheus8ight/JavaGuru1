package students.alex_kalashnikov.lesson_2.level_1.task_1;

class task1 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int sub = a - b;
        System.out.println("a - b = " + sub);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;
        System.out.println("a / b = " + div);

    }

}
