package students.lolita_polakova.lesson_2.level_3.task_11;

class TaskEleven {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите три целых числа:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double avr = (a+b+c)/3;

        System.out.println("Среднее арифметическое = " + avr);

    }
}
