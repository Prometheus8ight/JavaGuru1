package students.julija_katukova.lesson_6.level_3.task_12;

import java.util.Random;

class ArrayService {
    public boolean contains(int[] arr, int numberToSearch) {
        boolean check = false;
        for (int i : arr) {
            if (i == numberToSearch) {
                check = true;
                break;
            }
        }
        return check;
    }
}
