package students.andrew_galashin.lesson_6.level_4;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Task_21 {

    static class TwoDimensionalArray {
        public static void main(String[] args) {

            TwoDimensionalArrayDemo start = new TwoDimensionalArrayDemo();
            int first = start.x();
            int second = start.y();
            int[][] arr = start.randomize(first, second);
            int sum = start.sum(arr, first, second);
            System.out.println(Arrays.deepToString(arr));
            System.out.println("Сумма = " + sum);
        }
    }


    static class TwoDimensionalArrayDemo {

        public int x() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            return scanner.nextInt();
        }

        public int y() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите второе число: ");
            return scanner.nextInt();
        }

        int sum(int[][] arr, int x, int y) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int i2 = 0; i2 < arr[i].length; i2++) {
                    sum = sum + arr[i][i2];
                }
            }
            return sum;
        }

        int[][] randomize(int x, int y) {
            Random randomize = new Random();
            int[][] arr = new int[x][y];
            for (int i = 0; i < arr.length; i++) {
                for (int i2 = 0; i2 < arr[i].length; i2++) {
                    arr[i][i2] = randomize.nextInt(10);
                }
            }
            return arr;
        }


    }
}