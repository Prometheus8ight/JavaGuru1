package students.alex_kalashnikov.lesson_4.level_3.task_9;

class Incremental {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first integer: ");
        int intFirst = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int intSecond = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int intThird = scanner.nextInt();

        if (intFirst < intSecond && intSecond < intThird) {
            System.out.println("increasing");
            }
        else if (intFirst > intSecond && intSecond > intThird) {
            System.out.println("decreasing");
        }
        else {
            System.out.println("Neither increasing or decreasing order");
        }

    }

}
