package students.nikita_bunevich.lesson_4.level_1.task_3;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число от 1 до 7:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
               break;

        }
    }
}