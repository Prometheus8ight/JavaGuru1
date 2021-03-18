package students.andrew_galashin.lesson_4.level_2;

import java.util.Scanner;

class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        System.out.println("Введите второе целое число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x<y) {
            System.out.println(x);
        }
        else if (x>y) {
            System.out.println(y);
        }
        else {
            System.out.println("Числа равны");
        }
    }
}

