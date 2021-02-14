package students.vitaly_porsev.lesson_4.level_3.task_9;

import java.util.Scanner;

class NumOrder {

    void numIncDec() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b == a + 1 && c == b + 1) {
            System.out.println("increasing");
        } else if (b == a - 1 && c == b - 1) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
