package students.darja_scavrovica.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[3];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        System.out.println("Array length = "+ Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
        arr[i] = arr[i] + 2;}

        System.out.println("Array length = " + Arrays.toString(arr));
    }
}
