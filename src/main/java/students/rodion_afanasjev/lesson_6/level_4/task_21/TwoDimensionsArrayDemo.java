package students.rodion_afanasjev.lesson_6.level_4.task_21;

import java.util.Arrays;

class TwoDimensionsArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int numberOne = twoDimensionalArray.inputOne();
        int numberTwo = twoDimensionalArray.inputTwo();
        int[][] array = twoDimensionalArray.fillRandom(numberOne, numberTwo);
        int sum = twoDimensionalArray.sum(array, numberOne, numberTwo);
        System.out.println(Arrays.deepToString(array));
        System.out.println(sum);

    }
}


