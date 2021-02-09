package students.lolita_polakova.lesson_2.level_3.task_9;

class TaskNine {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Пожалуйста, введите целое число:");

        int num = scanner.nextInt();
        int i = 1;
        while (i <= 10) {

            System.out.println(num + "x" + i + "=" + num*i);
            i++;

        }

    }
}
