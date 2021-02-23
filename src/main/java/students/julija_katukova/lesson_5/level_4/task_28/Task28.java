package students.julija_katukova.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        int[] numbers = new int[7];//создайте массив произвольной длины
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(); //заполните массив случайными числами
        }
        System.out.println(Arrays.toString(numbers));//распечатайте на консоль все элементы массива
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) { //// найдите наименьшее число в массиве ! через чиклы !
            if (numbers[i] < min) {
                numbers[i] = min;
            }
        }
        System.out.println(min); // выведети его на консоль
    }
}
