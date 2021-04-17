package students.nikita_bunevich.lesson_4.task_2;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0)
            System.out.println("Это число положительное: " + num);
        else if (num < 0)
            System.out.println("Это число отрицательное: " + num);
        else {
            System.out.println("Это число равно нулю: " + num);
        }
    }
}
