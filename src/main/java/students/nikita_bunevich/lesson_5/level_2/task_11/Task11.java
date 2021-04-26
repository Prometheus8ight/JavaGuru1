package students.nikita_bunevich.lesson_5.level_2.task_11;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int numb1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int numb2 = scanner.nextInt();
        System.out.println("Введите третье число:");
        int numb3 = scanner.nextInt();

        int[] number = new int[3];
        number[0]=numb1;
        number[1]=numb2;
        number[2]=numb3;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
    }
}
