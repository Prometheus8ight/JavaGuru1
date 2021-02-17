package students.julija_katukova.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
       int[] numbers = new int[3];//создайте массив целых чисел длиной 3
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first number: "); // запрашиваем число у пользователя
        numbers[0] = scanner.nextInt(); // заполняем этим числом ячейку
        System.out.println("Please enter second number: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Please enter third number: ");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers)); // выводим на консоль
    }

}
