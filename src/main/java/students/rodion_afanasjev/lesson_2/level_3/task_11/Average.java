package students.rodion_afanasjev.lesson_2.level_3.task_11;

class Average {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter 3 numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        double result = (a + b + c) / 3f;

        System.out.println(result);

    }
}
