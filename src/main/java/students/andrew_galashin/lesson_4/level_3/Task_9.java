package students.andrew_galashin.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        System.out.println("Введите второе целое число: ");
        System.out.println("Введите третье целое число: ");

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();

                boolean increasing = x<y && y<a;
                boolean decreasing = x>y && y>a;

                    if (increasing) {
                        System.out.println("Increasing");
                    }
                    else if (decreasing) {
                        System.out.println("Decreasing");
                    }
                    else {
                        System.out.println("Neither increasing or decreasing order");
                    }
    }
}
