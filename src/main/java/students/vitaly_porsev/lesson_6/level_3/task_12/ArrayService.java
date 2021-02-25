package students.vitaly_porsev.lesson_6.level_3.task_12;

class ArrayService {

    boolean findNumberInArray(int[] array, int number) {
        for (int num : array) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
