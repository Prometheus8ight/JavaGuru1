package students.lolita_polakova.lesson_2.level_1.task_1;

class TaskOne {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Пожалуйста, введите любое целое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Пожалуйста, введите ещё одно целое число:");
        int secondNumber = scanner.nextInt();

        System.out.println("Наслаждайтесь чудесами математики!");

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(secondNumber - firstNumber);
        System.out.println(secondNumber / firstNumber);
    }
}

