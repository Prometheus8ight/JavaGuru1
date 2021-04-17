package students.nikita_bunevich.lesson_4.level_2.task_7;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num == num2)
            System.out.println("Данные числа равны");
        else
            System.out.println("Данные числа не равны");


    }
}

