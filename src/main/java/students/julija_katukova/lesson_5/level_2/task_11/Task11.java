package students.julija_katukova.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
       int[] numbers = new int[3];//создайте массив целых чисел длиной 3
        Scanner scanner= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter array element value: "); // запрашиваем число у пользователя
            numbers[i] = scanner.nextInt(); // заполняем этим числом ячейку
        }
        System.out.println(Arrays.toString(numbers)); // выводим на консоль
    }

}
