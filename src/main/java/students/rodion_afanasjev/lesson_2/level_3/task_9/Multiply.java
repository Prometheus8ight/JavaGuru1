package students.rodion_afanasjev.lesson_2.level_3.task_9;

class Multiply {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Input a number: ");

        int number = scanner.nextInt();

        for (int i=1; i<=10; i++) {

            System.out.println(number + " * " + i + " = " + number * i);

        }
    }
}