package students.vitaly_porsev.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        for(int arr : array){
            System.out.println(arr);
        }

        for (int arr : array){
            System.out.println(arr *= 2);
        }
    }
}
