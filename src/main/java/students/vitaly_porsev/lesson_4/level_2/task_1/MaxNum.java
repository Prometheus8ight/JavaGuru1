package students.vitaly_porsev.lesson_4.level_2.task_1;

import java.util.Scanner;

public class MaxNum {

    void maxNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Цифра " + a + " больше, чем " + b);
        } else if (b > a) {
            System.out.println("Цифра " + b + " больше, чем " + a);
        } else {
            System.out.println("Цифры равны!");
        }
    }
}
