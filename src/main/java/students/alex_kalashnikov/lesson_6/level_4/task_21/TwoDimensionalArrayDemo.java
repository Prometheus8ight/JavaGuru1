package students.alex_kalashnikov.lesson_6.level_4.task_21;

import java.util.Arrays;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        TwoDimensionalArray object = new TwoDimensionalArray();
        int[][] array = object.create(5);
        object.fillRandomly(array);
        object.sum(array);

    }

}
