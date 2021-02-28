package students.bogdans_pavlovs.lesson_6.level_4.task_21;

import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] array = new int[5][10];                    //создайте двумерный массив;
        twoDimensionalArray.fillArray(array);              //заполните двумерный массив случайными числами;
        int sum = twoDimensionalArray.countSum(array);     //посчитайте сумму всех чисел в двумерном массиве.

        System.out.println("Array Sum = " + sum);

        }


    //заполните двумерный массив случайными числами;

    public void fillArray(int[][] array) {

        Random fillArray = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i][i] = fillArray.nextInt();

            return;

        }

    }

    //посчитайте сумму всех чисел в двумерном массиве.

    public int countSum(int[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i][i];

        }

        return sum;
    }
}
