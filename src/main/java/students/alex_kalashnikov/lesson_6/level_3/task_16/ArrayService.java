package students.alex_kalashnikov.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayService {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3);
        }
    }

    void revert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - i - 1];
        }
        System.out.println(Arrays.toString(result));
        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
    }

}