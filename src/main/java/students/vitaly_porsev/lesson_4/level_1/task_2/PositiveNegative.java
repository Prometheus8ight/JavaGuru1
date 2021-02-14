package students.vitaly_porsev.lesson_4.level_1.task_2;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        System.out.println(positiveNegative());
    }

    static String positiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число");
        int num = scanner.nextInt();
        if (num == 0) {
            return "Число равно нулю!";
        } else if (num > 0) {
            return num + " - положительное число!";
        } else {
            return num + " - отрицательное число!";
        }
    }

}
