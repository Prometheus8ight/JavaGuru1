package students.julija_katukova.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        int[] numbers = new int[11]; //создайте массив произвольной длины
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            numbers[i] = random.nextInt();//заполните массив случайными числами
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < 11; i++) {
            if (numbers[i] % 2 == 0) { //найдите все чётные числа в массиве
                System.out.println(numbers[i]); // выведети их на консоль
            }
        }
    }

}
