package students.alex_kalashnikov.lesson_2.level_3.task_9;

class task_9 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt(); // a - first multiplier (any int digit)

        int b = 1;

        while (b < 10) {
// second multiplier = 10
            int multi = a * b;
            System.out.println("a * b = " + multi);
            b = b + 1;
        if (b == 10) {

            int multi2 = a * 10;
            System.out.println("a * b = " + multi2);

        } // end if


        } // end while

    }

}
