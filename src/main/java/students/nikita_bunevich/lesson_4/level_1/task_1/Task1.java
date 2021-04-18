package students.nikita_bunevich.lesson_4.level_1.task_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (0 < num)
        System.out.println("Это число положительное: " + num);
        else {
            System.out.println("Это число отрицательное: " + num);
        }


    }
}
