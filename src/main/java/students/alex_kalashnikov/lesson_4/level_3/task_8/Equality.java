package students.alex_kalashnikov.lesson_4.level_3.task_8;

class Equality {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first integer: ");
        int intFirst = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int intSecond = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int intThird = scanner.nextInt();

        if (intFirst == intSecond && intFirst == intThird) {
            System.out.println("All numbers are equal");
            }
        else if (intFirst != intSecond && intFirst !=intThird && intSecond != intThird) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }

    }

}
