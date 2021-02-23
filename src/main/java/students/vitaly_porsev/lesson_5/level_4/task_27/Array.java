package students.vitaly_porsev.lesson_5.level_4.task_27;

import java.util.Random;

class Array {

    void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    int findMaxNum(int[] array) {
        int maxNum = 0;
        for (int arr : array) {
            if (arr > maxNum) {
                maxNum = arr;
            }
        }
        return maxNum;
    }


}
