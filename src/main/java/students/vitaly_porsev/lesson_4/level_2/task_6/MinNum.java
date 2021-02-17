package students.vitaly_porsev.lesson_4.level_2.task_6;

import java.util.Scanner;

public class MinNum {

    String minNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a == b ? "Числа равны!" : a < b ? "Число " + a + " меньше, чем число " + b +"." :
                "Число " + b + " меньше, чем число " + a + ".";
    }
}
