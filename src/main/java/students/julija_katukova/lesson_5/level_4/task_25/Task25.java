package students.julija_katukova.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: "); //запросите у пользователя с консоли длину массива
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter array element value: "); //заполните массив числами полученными от пользователя
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

    }
}
