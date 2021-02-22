package students.andrew_galashin.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введите первое целое число: ");
        System.out.println("Введите второе целое число: ");
        System.out.println("Введите третье целое число: ");

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int a = scanner.nextInt();

                boolean xbigger1 = x>y && y>a;
                boolean xgibber2 = x>a && a>y;
                boolean ybigger1 = y>x && x>a;
                boolean ybigger2 = y>a && a>x;
                boolean abigger1 = a>x && x>y;
                //boolean abigger2 = a>y && y>x;

                    if (xbigger1) {
                        System.out.println("Наибольшее число = " + x);
                    }
                    else if (xgibber2) {
                        System.out.println("Наибольшее число = " + x);
                    }
                    else if (ybigger1) {
                        System.out.println("Наибольшее число = " + y);
                    }
                    else if (ybigger2) {
                        System.out.println("Наибольшее число = " + y);
                    }
                    else if (abigger1) {
                        System.out.println("Наибольшее число = " + a);
                    }
                    else {
                        System.out.println("Наибольшее число = " + a);
                    }

    }
}
// x>y>a    x>a>y
// y>x>a    y>a>x
// a>x>y    a>y>x