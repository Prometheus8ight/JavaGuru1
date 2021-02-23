package students.julija_katukova.lesson_5.level_2.task_14;

import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        int[] numbers = new int[3]; //создайте массив целых чисел длиной 3
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(); //заполните каждую ячейку массива случайным числом
            sum = sum + numbers[i];
        }
        int average = sum / numbers.length; //посчитайте среднее значение и выведите его на консоль
        System.out.println(average);
    }
}
