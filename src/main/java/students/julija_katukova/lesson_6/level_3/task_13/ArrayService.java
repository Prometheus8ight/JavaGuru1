package students.julija_katukova.lesson_6.level_3.task_13;

class ArrayService {
    public int countOccurrences(int[] arr, int numberToSearch){
        int count = 0;
        for (int j : arr) {
            if (j == numberToSearch) {
                count++;
            }
        }
        return count;
    }
}
