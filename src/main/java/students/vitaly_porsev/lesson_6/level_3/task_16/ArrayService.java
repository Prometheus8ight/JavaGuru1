package students.vitaly_porsev.lesson_6.level_3.task_16;

class ArrayService {

    void reverseArray(int[] array) {
        int temp;
        int arrayEnd = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[arrayEnd];
            array[arrayEnd] = temp;
            arrayEnd--;
        }
    }
}
