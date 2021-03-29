package students.deniss_jankovskis.lesson_5.level_5;

import java.util.Random;

class Arrays {


    public static int[] create(int length) {
        int[] num = new int[length];
        return num;
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(java.util.Arrays.toString(array));
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(java.util.Arrays.toString(array));
        }

    }

    public static int findMax(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }


    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }

}
