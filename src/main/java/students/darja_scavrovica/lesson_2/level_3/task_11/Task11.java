package students.darja_scavrovica.lesson_2.level_3.task_11;

class Task11 {
    public static void main(String[] args) {
        System.out.println("Ввведите три целых числа");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Float result = (a+b+c)/3f;
        System.out.println("среднее арифметическое = "+ result);



    }}
