package students.vitaly_porsev.lesson_5.level_7.task_41;

import java.util.Random;
import java.util.Arrays;

class Array {

    void fillArray(int[] array) {
        Random random = new Random();
        Arrays.fill(array, random.nextInt(100));
    }

    void sortArray(int[] array){
        Arrays.sort(array);
    }

    void searchIndex(int[] array, int num){
        System.out.println("Индекс: " + Arrays.binarySearch(array, num));
    }

    void equalArrays(int[] array1, int[] array2){
        boolean trueOrNot = Arrays.equals(array1, array2);
        if(trueOrNot){
            System.out.println("Arrays are equal!");
        }else {
            System.out.println("Arrays are not equal!");
        }
    }

    void copyRangeArray(int[] array, int rangeFrom, int rangeTo){
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, rangeFrom, rangeTo)));
    }

}
