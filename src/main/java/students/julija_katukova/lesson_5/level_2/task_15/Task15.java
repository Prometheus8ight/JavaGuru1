package students.julija_katukova.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; //создайте массив целых чисел длиной 3
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(); //заполните каждую ячейку массива случайным числом
        }
        System.out.println(Arrays.toString(numbers));//выведите значение каждой ячейки на консоль

        for (int i = 0; i < 3; i++) {
            numbers[i] = numbers[i] * 2; //увеличьте значение каждой ячейки на 2
        }
        System.out.println(Arrays.toString(numbers));//выведите значение каждой ячейки на консоль
    }
}
