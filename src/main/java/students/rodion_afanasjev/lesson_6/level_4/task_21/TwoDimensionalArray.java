package students.rodion_afanasjev.lesson_6.level_4.task_21;

import java.util.Random;
import java.util.Scanner;

class TwoDimensionalArray {

    public int inputOne() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        return scan.nextInt();
    }

    public int inputTwo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input second number: ");
        return scan.nextInt();
    }

    public int[][] fillRandom(int numberOne, int numberTwo) {
        Random random = new Random();
        int[][] array = new int[numberOne][numberTwo];
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {

                array[row][column] = random.nextInt(5);
            }
        }
        return array;
    }

    public int sum(int[][] array, int numberOne, int numberTwo) {
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                sum += array[row][column];
            }
        }
        return sum;
    }

}
