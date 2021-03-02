package students.rodion_afanasjev.lesson_6.level_3.task_12;

import java.util.Arrays;

class ArrayService {

    boolean findNumberInArray(int[] array, int findNumber) {
        for (int i : array) {
            if (i == findNumber) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] array, int findNumber) {
        int count = 0; // переменная количества повторов
        for (int i : array) { // цикл сравнивает вводное число с массивом
            if (i == findNumber) { // когда число в массиве равняется вводному, count + 1
                count++;
            }
        }
        return count; // возвращаем переменную с количеством повторений
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAllNumbers(int[] array, int numberToReplace, int newNumber) {
        int replace = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                replace++;
            }
        }
        return replace;
    }

    void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int index = array.length - i - 1;
            array[i] = array[index];
            array[index] = temp;
        }
    }

    void sortFromMinToMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}