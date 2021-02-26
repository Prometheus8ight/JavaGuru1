package students.kate_br.lesson_6.level_3.task_13;

class ArrayService {

    int countOccurrences(int[] arr, int numberToSearch) {

        int count = 0;

        for (int num : arr) {
            if (num == numberToSearch) {
                count++;
            }
        }
        return count;
    }
}





