package students.nikita_bunevich.lesson_4.level_1.task_4;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println("Это число четное: " + num);
        else{
            System.out.println("Это число не четное: " + num);
        }
    }
}
