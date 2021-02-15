package students.vitaly_porsev.lesson_4.level_3.task_10;

import java.util.Scanner;

class MaxNum {

    void findMaxNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c || a == b && a > c ) {
            System.out.println(a);
        } else if (b > a && b > c || b == c && b > a) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}
