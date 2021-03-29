package students.andrew_galashin.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public int max(int a, int x){
        if (x > a){
            return x;
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        Task_10 test = new Task_10();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int a = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int y = scanner.nextInt();

        int X = test.max(a, y);
        int result = test.max(x,X);
        System.out.println(result);

    }

}
