package students.pavels_steinbors._lesson_2._level_3._task_9;

class Table {
    public static void main(String[] args) {


        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Test data:");
        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + number * i);


        }
    }


}
