package students.deniss_jankovskis.lesson_6.level_3.task_13;

public class ArrayService {


    public static int countOccurrences(int[] arr, int numberToSearch) {

        int count = 0;
        for (int num : arr) {
            if (num == numberToSearch) {
                count++;
            }

        }
        return count;

    }

}
