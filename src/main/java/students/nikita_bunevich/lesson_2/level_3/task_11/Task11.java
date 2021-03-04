package students.nikita_bunevich.lesson_2.level_3.task_11;

class Task11 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstnumber = scanner.nextInt();
        System.out.println("Введите второе число:");
        int secondnumber = scanner.nextInt();
        System.out.println("Введите третье число:");
        int thirdnumber = scanner.nextInt();

        double a = firstnumber+secondnumber+thirdnumber;
        System.out.println("Среднее Арифмитеческое:" + (a) / 3);
    }
}
