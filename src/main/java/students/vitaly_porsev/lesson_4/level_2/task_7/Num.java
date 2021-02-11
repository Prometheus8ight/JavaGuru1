package students.vitaly_porsev.lesson_4.level_2.task_7;

import java.util.Scanner;

class Num {
    String equalOrDifferent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a == b ? "Числа равны!" : "Числа не равны!";
    }
}
