package students.alex_kalashnikov.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayService {


    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    void sortFromMinToMax(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min1 = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min1 = j;
                }
            }
            int temp = array[i];
            array[i] = array[min1];
            array[min1] = temp;
        }
    }

    void sortFromMaxToMin(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int max1 = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max1 = j;
                }
            }
            int temp = array[i];
            array[i] = array[max1];
            array[max1] = temp;
        }
    }

}
