package students.andrew_galashin.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        System.out.println("Введите второе целое число: ");
        System.out.println("Введите третье целое число: ");

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();




                boolean equal = x==y && y==a;
                boolean different = x!=y&& y!=a;

                    if (equal) {
                        System.out.println("All numbers are equal");
                    }
                    else if (different) {
                        System.out.println("All numbers are different");
                    }
                    else  {
                        System.out.println("Neither all are equal or different");
                        }
    }
}
