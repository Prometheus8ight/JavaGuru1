package students.bogdans_pavlovs.lesson_5.level_6;

import java.util.Random;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {

        Random fillArray = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = fillArray.nextInt();
        }

    }

    public void print(int[] array) {

        System.out.print("Your array contains: ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "; ");
        }

    }

    public int findMax(int[] array) {

        int maxValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    public int findMin(int[] array) {

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < minValue) {
                minValue = array[i];
            }

        }

        return minValue;
    }

}