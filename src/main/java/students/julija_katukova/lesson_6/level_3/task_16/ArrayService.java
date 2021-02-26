package students.julija_katukova.lesson_6.level_3.task_16;

class ArrayService {
    public void revert(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
    }
}
