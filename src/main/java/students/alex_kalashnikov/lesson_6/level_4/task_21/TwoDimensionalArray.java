package students.alex_kalashnikov.lesson_6.level_4.task_21;

import java.util.Arrays;

class TwoDimensionalArray {

    public int[][] create(int length) {
        return new int[length][length];
    }

    public void fillRandomly(int[][] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    /*
        public void printArray(int[][] array) {

            for (int j = 0; j < array.length; j++) {
                int i = 0;

                for (i = 0; i < array.length; i++) {

                    //    for (i = 0; j < array.length; i++) {

                }

                System.out.print(array[i][j]);
            }

    //    }

    */
    public void sum(int[][] array) {
        int sum = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of all element value is: " + sum);
    }

}
