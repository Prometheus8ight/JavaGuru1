package students.julija_katukova.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class Task30 {
    public static void main(String[] args) {
        int[] numbers = new int[15];//создайте массив произвольной длины
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            numbers[i] = random.nextInt(); //заполните массив случайными числами
        }
        System.out.println(Arrays.toString(numbers)); //распечатайте на консоль все элементы массива
        for (int i = 0; i < 15; i++) {
            if (numbers[i] % 2 != 0) { //найдите все нечётные числа в массиве
                System.out.print(numbers[i] + " "); // выведети их на консоль
            }
        }
    }

}
