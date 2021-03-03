package students.julija_katukova.lesson_6.level_4.task_21;

import java.util.Arrays;
import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] numbers = new int[5][5]; //создайте двумерный массив
        twoDimensionalArray.action(numbers);
        int sum = twoDimensionalArray.sum(numbers);
        twoDimensionalArray.display(Arrays.deepToString(numbers), sum);
    }

    public void action(int[][] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
            }
        }
    }

    public int sum(int[][] numbers) {
        int sum = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                sum += i;
            }
        }
        return sum;
    }

    public void display(String numbers, int sum) {
        System.out.println(numbers);
        System.out.println(sum);
    }
}
