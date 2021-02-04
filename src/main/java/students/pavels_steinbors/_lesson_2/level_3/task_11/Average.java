package students.pavels_steinbors._lesson_2.level_3.task_11;

class Average {


    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int a,b,c;
        System.out.println("Введите число а: ");
        a = scanner.nextInt();
        System.out.println("Введите число b: ");
        b = scanner.nextInt();
        System.out.println("Введите число c: ");
        c = scanner.nextInt();

        double d =(a+b+c)/3f;
        System.out.println("Среднее арифметическое = " +d);
    }
}
