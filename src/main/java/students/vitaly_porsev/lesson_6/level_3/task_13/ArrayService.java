package students.vitaly_porsev.lesson_6.level_3.task_13;

class ArrayService {

    int countOccurrences(int[] array, int numberToSearch) {
        int counter = 0;
        for (int num : array) {
            if (num == numberToSearch) {
                counter++;
            }
        }
        return counter;
    }
}
