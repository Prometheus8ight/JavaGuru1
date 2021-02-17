package students.alex_kalashnikov.lesson_4.level_1.task_1;

class DigitSign {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter integer: ");
        int integer = scanner.nextInt();

        if (integer >= 0) {
            System.out.println("Integer is positive");
        } else {
            System.out.println("Integer is negative");
        }
    }
}