package students.deniss_jankovskis.lesson_6.level_3.task_12;

public class ArrayService {


    public boolean contains(int[] arr, int numberToSearch) {

        for (int num : arr) {
            if (num == numberToSearch) {
                return true;
            }
        }
        return false;
    }


}
