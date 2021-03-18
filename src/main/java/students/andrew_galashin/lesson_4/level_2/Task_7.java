package students.andrew_galashin.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        System.out.println("Введите второе целое число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

            if (x==y) {
                System.out.println("Numbers are equals");
            }
            else {
                System.out.println("Numbers are different");
            }
    }
}
