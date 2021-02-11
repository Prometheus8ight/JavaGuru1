package students.vitaly_porsev.lesson_4.level_1.task_1;

import java.util.Scanner;

class Num {
    public static void main(String[] args) {
        System.out.println(positiveNegative());
    }


    static String positiveNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int num = scanner.nextInt();
        return num == 0 ? num + " - нейтральное число!" : num > 0 ? num + " - положительное число!" : num + " - отрицательное число!";
    }


}
