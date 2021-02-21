package students.bogdans_pavlovs.lesson_5.level_2.task_15;

/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.

 */

import java.util.Random;

class ArrayTask15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random generator = new Random();

        numbers[0] = generator.nextInt(97);
        numbers[1] = generator.nextInt(97);
        numbers[2] = generator.nextInt(97);

        System.out.println("Current values: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);

        numbers[0] = numbers[0] + 2;
        numbers[1] = numbers[1] + 2;
        numbers[2] = numbers[2] + 2;

        System.out.println("New values: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);

    }
}
