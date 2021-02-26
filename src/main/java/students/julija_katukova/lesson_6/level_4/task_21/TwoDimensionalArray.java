package students.julija_katukova.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] numbers = new int [5][5]; //создайте двумерный массив
        int sum = 0;
        sum = twoDimensionalArray.action(numbers, sum);
        twoDimensionalArray.display(Arrays.deepToString(numbers), sum);
    }

    public int action (int[][] numbers, int sum) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10); //заполните двумерный массив случайными числами
                sum += numbers[i][j]; //посчитайте сумму всех чисел в двумерном массиве
            }
        }
        return sum;
    }

    public void display (String numbers, int sum) {
        System.out.println(numbers);
        System.out.println(sum);
    }

}
