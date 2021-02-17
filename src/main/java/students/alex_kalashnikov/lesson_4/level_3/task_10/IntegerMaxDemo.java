package students.alex_kalashnikov.lesson_4.level_3.task_10;

class IntegerMaxDemo {

    public static void main(String[] args) {

        IntegerMax test = new IntegerMax();

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter first integer: ");
        int intFirst = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int intSecond = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int intThird = scanner.nextInt();

        int x = test.max1(intSecond,intThird);
        int result = test.max(intFirst,x);
        System.out.println(result);

    }
}