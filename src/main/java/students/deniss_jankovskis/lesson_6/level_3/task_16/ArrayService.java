package students.deniss_jankovskis.lesson_6.level_3.task_16;

class ArrayService {

    void revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
    }


}
