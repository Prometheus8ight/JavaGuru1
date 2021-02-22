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

        for(int i = 0; i < numbers.length; i++){

            numbers[i] = generator.nextInt(99);
        }


        System.out.println("Current values: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);

        for(int i = 0; i < numbers.length; i++){

            numbers[i] = numbers[i] + 2;

        }

        System.out.println("New values: " + numbers[0] + ", " + numbers[1] + ", " + numbers [2]);

    }
}
