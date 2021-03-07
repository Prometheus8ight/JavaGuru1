package students.arkadij.lesson_6.level_3.task_17;
import java.util.Arrays;

class ArrayService {

    void sort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int b = i + 1; b < arr.length; b++){
                int temp = 0;
                if (arr[i] > arr[b]){
                    temp = arr[i];
                    arr[i] = arr[b];
                    arr[b] = temp;
                }
            }
        }
    }

}
