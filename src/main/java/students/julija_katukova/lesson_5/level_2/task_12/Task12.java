package students.julija_katukova.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; //создайте массив целых чисел длиной 3
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(); //заполните каждую ячейку массива случайным числом
        }
        System.out.println(Arrays.toString(numbers)); //выведите значение каждой ячейки на консоль

    }

}
