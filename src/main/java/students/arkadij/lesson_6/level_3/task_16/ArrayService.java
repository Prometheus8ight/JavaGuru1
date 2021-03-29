package students.arkadij.lesson_6.level_3.task_16;

class ArrayService {

    void revert(int[] arr){
        int temp;
        for (int i = 0; i < arr.length / 2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}
