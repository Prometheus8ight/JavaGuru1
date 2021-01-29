package students.vitaly_porsev.lesson_2.level_3.task_9;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для умножения:");
        int multiply = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(multiply + " * " + i + " = " + multiply * i);
        }
        scanner.close();
    }
}
