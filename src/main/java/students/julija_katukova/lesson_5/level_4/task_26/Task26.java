package students.julija_katukova.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length: "); //запросите у пользователя с консоли длину массива
        int length = scanner.nextInt();
        int[] numbers = new int[length];//создайте массив указанной пользователем длины

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            numbers[i] = random.nextInt(); //заполните массив случайными числами
        }

        System.out.println(Arrays.toString(numbers)); //распечатайте на консоль все элементы массива
    }
}
