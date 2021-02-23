package students.julija_katukova.lesson_5.level_2.task_10;

import java.util.Arrays;

class Task10 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; //создайте массив целых чисел длиной 3
        numbers[0] = 123;//заполните каждую ячейку массива любым целым числом
        numbers[1] = 321;
        numbers [2] = 231;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); //выведите значение каждой ячейки на консоль - теперь сделано через цикл :)
        }

    }
}
