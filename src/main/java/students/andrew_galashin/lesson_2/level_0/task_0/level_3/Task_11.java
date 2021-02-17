package students.andrew_galashin.lesson_2.level_0.task_0.level_3;

class Task_11 {
    public static void main(String[] args) {
        System.out.println("Введите первое число - ");
        System.out.println("Введите второе число - ");
        System.out.println("Введите третье число - ");


        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        double avarage = ((double) firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Среднее арефметическое" + avarage);


    }
}
