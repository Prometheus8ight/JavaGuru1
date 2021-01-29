package students.pavels_steinbors.lesson_2._level_1._task_1;

class FisrstTask {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите два целых числа:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);

    }
}

