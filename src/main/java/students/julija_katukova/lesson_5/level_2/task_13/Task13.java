package students.julija_katukova.lesson_5.level_2.task_13;

import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; //создайте массив целых чисел длиной 3
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            numbers[i] = random.nextInt(); //заполните каждую ячейку массива случайным числом
            sum += numbers[i]; //посчитайте сумму всех ячеек
        }
        System.out.println(sum); //распечатайте сумму всех ячеек на консоль
    }
}
