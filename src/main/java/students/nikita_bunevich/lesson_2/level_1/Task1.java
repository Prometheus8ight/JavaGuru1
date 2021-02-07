package students.nikita_bunevich.lesson_2.level_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        System.out.println("Сложение:" + (firstNumber + secondNumber));
        System.out.println("Вычитание:" + (firstNumber - secondNumber));
        System.out.println("Умножение:" + firstNumber * secondNumber);
        System.out.println("Деление:"+ firstNumber / secondNumber);


    }


}
