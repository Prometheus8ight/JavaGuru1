package students.bogdans_pavlovs.lesson_2.level_3.task_11;

class task_11 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter 3rd number: ");
        int thirdNumber = scanner.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;


        double average = (double) total / 3;

        System.out.println("Average = " + average);

        //Примечение: обратите внимание, что результат может быть дробным числом.
    }
}
