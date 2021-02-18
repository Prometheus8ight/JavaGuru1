package students.julija_katukova.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //создайте массив произвольной длины
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(); //заполните массив случайными числами
        }
        System.out.println(Arrays.toString(numbers)); //распечатайте на консоль все элементы массива
        System.out.println(Arrays.stream(numbers).max().getAsInt()); // найдите наибольшее число в массиве и выведети его на консоль

    }
}
