package students.andrew_galashin.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x%2==0) {
            System.out.println("Число чётное");
        }
        else {
            System.out.println("Число нечётное");
        }

    }
}
