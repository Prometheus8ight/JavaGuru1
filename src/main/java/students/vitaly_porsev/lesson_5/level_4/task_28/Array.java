package students.vitaly_porsev.lesson_5.level_4.task_28;

import java.util.Random;

class Array {

    void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    int findMinNum(int[] array) {
        int minNum = array[0];
        for (int num : array) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }


}
